package com.anita.paybox_api;

import com.anita.paybox_api.product_categories.*;
import com.anita.paybox_api.repositories.*;

import org.springframework.web.bind.annotation.*;

import org.springframework.scheduling.annotation.Scheduled;

import javax.validation.constraints.NotBlank;

@RestController
public class ServiceController {

    private final TransactionRepository transactionRepository;

    ServiceController (TransactionRepository transactionRepository){
            this.transactionRepository = transactionRepository;
    }

    @Scheduled(fixedRate = 5000)
    public void sendPaymentData() {
        transactionRepository.findAllByOrderByCommissionDesc()
                .forEach(System.out::println);
    }

    @CrossOrigin
    @PostMapping("/{payment_type}_payment")
    Transaction newTransaction(
            @PathVariable("payment_type") @NotBlank  String payment_type,
            @RequestBody Transaction transaction
    ) {
        transaction.setServiceType(payment_type);
        return transactionRepository.save(transaction);
    }

}