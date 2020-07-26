package com.anita.paybox_api.product_categories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FinancialService implements Commission {

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
        String IDNumber, String accountNumber){

        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.commission = commission;
        this.IDNumber = IDNumber;
        this.accountNumber = accountNumber; 
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public Double getAmount() {
        return this.amount;
    }

    public Double getCommission() {
        return this.commission;
    }

    public String getIDNumber() {
        return this.IDNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setServiceType(String type){
        this.serviceType = type;
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