package com.anita.paybox_api.product_categories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;


@Entity
public class Transaction {
    private @Id @GeneratedValue Long id;

    @Pattern(regexp = "^5[0-9]{8}$")
//    @Column(nullable = false)
    private String mobileNumber;

    @Min(1)
    @Max(100)
//    @Column(nullable = false)
    private Double moneyAmount;

    @DecimalMin("0.5")
//    @Column(nullable = false)
    private Double commission;

    @Pattern(regexp = "^[a-z]*$")
//    @Column(nullable = false)
    private String serviceType;

    @Pattern(regexp = "^[0-9]{11}$")
    private String idNumber;

    @Pattern(regexp = "^GE[0-9]{2}[A-Z]{2}[0-9]{16}")
    private String accountNumber;

    public Transaction() {}

    public Transaction(String mobileNumber,
                       Double moneyAmount, Double commission,
                       String idNumber, String accountNumber){
        this.mobileNumber = mobileNumber;
        this.moneyAmount = moneyAmount;
        this.commission = commission;
        this.idNumber = idNumber;
        this.accountNumber = accountNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(Double amount) {
        this.moneyAmount = amount;
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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String IDNumber) {
        this.idNumber = IDNumber;
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
                "phone number: " + this.mobileNumber +
                " amount: " + this.moneyAmount +
                " commission: " + this.commission +
                " ID number: " + this.idNumber +
                " account number: " + this.accountNumber;
    }

}