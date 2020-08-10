package com.anita.paybox_api.product_categories;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private @Id @GeneratedValue Long id;

    @Pattern(regexp = "^5[0-9]{8}$")
    private String mobileNumber;

    @Min(1)
    @Max(100)
    private Double moneyAmount;

    @DecimalMin("0.5")
    private Double commission;

    @Pattern(regexp = "^[a-z]*$")
    private String serviceType;

    @Pattern(regexp = "^[0-9]{11}$")
    private String idNumber;

    @Pattern(regexp = "^GE[0-9]{2}[A-Z]{2}[0-9]{16}")
    private String accountNumber;
}