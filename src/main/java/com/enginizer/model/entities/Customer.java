package com.enginizer.model.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

/**
 * Created by CalinM on 11/19/2016.
 */
public class Customer extends User {

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @OneToOne(targetEntity = PaymentInfo.class,mappedBy = "id")
    private PaymentInfo paymentInfo;
}
