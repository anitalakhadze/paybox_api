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
        Double amount, Double commission, 
        String serviceType){

        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.commission = commission;
        this.serviceType = serviceType;
    }
}