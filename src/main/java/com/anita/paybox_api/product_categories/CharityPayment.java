package com.anita.paybox_api.product_categories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CharityPayment {

    private @Id @GeneratedValue Long id;
    private String phoneNumber; 
    private Double amount;
    private Double commission;
    private String serviceType;
    private String IDNumber; 

    public CharityPayment() {}

    public CharityPayment(String phoneNumber, 
        Double amount, Double commission, 
        String serviceType, String IDNumber){

        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.commission = commission;
        this.serviceType = serviceType;
        this.IDNumber = IDNumber;
    }
    
}