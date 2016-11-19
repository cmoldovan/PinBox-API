package com.enginizer.model.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by CalinM on 11/19/2016.
 */
public class OrderAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(name = "Identifier of the user")
    private int idOrderAddress;
    private Order order;
    @Column(name = "type",nullable = false)
    private boolean type; /*0 for pickup 1 for delivery*/
    private City city;
    @Column(name = "apNumber",nullable = true)
    private String apNumber;
    @Column(name = "streetNumber",nullable = false)
    private String streetNumber;
    @Column(name = "extraDetails",nullable = true)
    private String extraDetails;
    @Column(name = "zipcode",nullable = true)
    private int zipcode;
    private Route route;

}
