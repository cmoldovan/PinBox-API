package com.enginizer.model.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by CalinM on 11/19/2016.
 */
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(name = "Identifier of the adress")
    private int id;

    private User idUser;
    private City idCity;
    @Column(name = "streetName", nullable = false)
    private String streetName;
    @Column(name = "streetNumber")
    private String streetNumber;
    @Column(name = "zipCode" )
    private int zipCode;
    @Column(name = "apNumber")
    private String apNumber;
    @Column(name = "moreInfo")
    private String moreInfo;
    @Column(name = "latitude", nullable = false)
    private float latitude;
    @Column(name = "longitude", nullable = false)
    private float longitude;
}
