package com.anita.paybox_api.product_categories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CommunalPayment {

    private @Id @GeneratedValue Long id;
    private String phoneNumber; 
    private Double amount;
    private Double commission;
    private String serviceType;
    private String IDNumber; 

    public CommunalPayment() {}

    public CommunalPayment(String phoneNumber, 
        Double amount, Double commission, 
        String serviceType, String IDNumber){

        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.commission = commission;
        this.serviceType = serviceType;
        this.IDNumber = IDNumber;
    }

    @Override
    public String toString() {
        return "Service (" + this.serviceType + ") " +
        "phone number: " + this.phoneNumber + 
        " amount: " + this.amount + 
        " commission: " + this.commission +
        " ID number: " + this.IDNumber;
    }
    
}