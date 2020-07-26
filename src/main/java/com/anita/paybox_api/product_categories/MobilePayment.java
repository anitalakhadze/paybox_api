package com.anita.paybox_api.product_categories;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class MobilePayment {
    
    private @Id @GeneratedValue Long id;
    private String phoneNumber; 
    private Double amount;
    private Double commission;
    private String serviceType;

    public MobilePayment() {}

    public MobilePayment(String phoneNumber, 
        Double amount, Double commission){

        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.commission = commission;
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

    public void setServiceType(String type){
        this.serviceType = type;
    }

    @Override
    public String toString() {
        return "Service (" + this.serviceType + ") " +
        "phone number: " + this.phoneNumber + 
        " amount: " + this.amount + 
        " commission: " + this.commission;
    }
}