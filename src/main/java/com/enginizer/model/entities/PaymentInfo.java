package com.enginizer.model.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by CalinM on 11/19/2016.
 */
public class PaymentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(name = "Identifier of the payment")
    private int idPayment;
    private User user;
    @Column(name = "cardNumber",nullable = false)
    private String cardNumber;
    @Column(name = "cardOwner",nullable = false)
    private String cardOwner;
    @Column(name = "expiryDate",nullable = false)
    private Date expiryDate;
}
