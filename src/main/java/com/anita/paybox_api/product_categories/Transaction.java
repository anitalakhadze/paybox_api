package com.anita.paybox_api.product_categories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Transaction {
    private @Id @GeneratedValue Long id;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private Double amount;
    @Column(nullable = false)
    private Double commission;
    @Column(nullable = false)
    private String serviceType;

    private String IDNumber;
    private String accountNumber;

    public Transaction() {}

    public Transaction(String phoneNumber,
                            Double amount, Double commission,
                            String IDNumber, String accountNumber){
        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.commission = commission;
        this.IDNumber = IDNumber;
        this.accountNumber = accountNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
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