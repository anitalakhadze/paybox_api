package com.anita.paybox_api;

import com.anita.paybox_api.product_categories.CharityPayment;
import com.anita.paybox_api.product_categories.CommunalPayment;
import com.anita.paybox_api.product_categories.FinancialService;
import com.anita.paybox_api.product_categories.MobilePayment;
import com.anita.paybox_api.repositories.CharityRepository;
import com.anita.paybox_api.repositories.CommunalRepository;
import com.anita.paybox_api.repositories.FinancialRepository;
import com.anita.paybox_api.repositories.MobileRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    private final MobileRepository mobileRepository;
    private final CharityRepository charityRepository;
    private final CommunalRepository communalRepository;
    private final FinancialRepository financialRepository;
    
    ServiceController (MobileRepository mobRep,
        CharityRepository charityRep,
        CommunalRepository communalRep,
        FinancialRepository financialRep){
            this.mobileRepository = mobRep;
            this.charityRepository = charityRep;
            this.communalRepository = communalRep;
            this.financialRepository = financialRep;
        }

    @PostMapping("/mobile_payment")
    MobilePayment newMobilePayment (
        @RequestBody MobilePayment newMobilePayment) {

        newMobilePayment.setServiceType("mobile");
        System.out.println(newMobilePayment);
        return mobileRepository.save(newMobilePayment);
    }

    @PostMapping("/charity_payment")
    CharityPayment newCharityPayment (
        @RequestBody CharityPayment newCharityPayment) {

        newCharityPayment.setServiceType("charity");
        return charityRepository.save(newCharityPayment);
    }

    @PostMapping("/communal_payment")
    CommunalPayment newCommunalPayment (
        @RequestBody CommunalPayment newCommunalPayment) {

        newCommunalPayment.setServiceType("communal");
        return communalRepository.save(newCommunalPayment);
    }

    @PostMapping("/financial_service")
    FinancialService newFinancialService (
        @RequestBody FinancialService newFinancialService) {

        newFinancialService.setServiceType("financial");
        return financialRepository.save(newFinancialService);
    }
}