package com.enginizer.model.entities;

import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.ws.soap.Addressing;

/**
 * Created by CalinM on 11/19/2016.
 */
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(name = "Identifier of the user")
    private int idOrder;
    private User senderUser;
    private User recieverUser;
    private Rack rack;
    private Address pickupAddress;
    private Address deliveryAddress;
    @Column(name = "orderDate",nullable = false)
    private DateTime orderDate;
    private Status status;
    @Column(name = "orderAmount", nullable = false)
    private float orderAmount;
    @Column(name = "feeAmount", nullable = false)
    private float feeAmount;
    private OrderPaymentStatus orderPaymentStatus;

}
