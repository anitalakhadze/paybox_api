package com.anita.paybox_api.repositories;

import com.anita.paybox_api.product_categories.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByOrderByCommissionDesc();
    long deleteTransactionByAccountNumberIn(List<Long> id);
}