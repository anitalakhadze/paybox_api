package com.anita.paybox_api.product_categories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FinancialService {

    private @Id @GeneratedValue Long id;
    private String phoneNumber; 
    private Double amount;
    private Double commission;
    private String serviceType;
    private String IDNumber; 
    private String accountNumber;

    public FinancialService() {}

    public FinancialService(String phoneNumber, 
        Double amount, Double commission, 
        String serviceType, String IDNumber,
        String accountNumber){

        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.commission = commission;
        this.serviceType = serviceType;
        this.IDNumber = IDNumber;
        this.accountNumber = accountNumber; 
    }

    @Override
    public String toString() {
        return "Service (" + this.serviceType + ") " +
        "phone number: " + this.phoneNumber + 
        " amount: " + this.amount + 
        " commission: " + this.commission +
        " ID number: " + this.IDNumber + 
        " account number: " + this.accountNumber;
    }
    
}