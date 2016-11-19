package com.enginizer.model.entities;

import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by CalinM on 11/19/2016.
 */
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(name = "Identifier of the user")
    private int idCar;
    private Route route;
    @Column(name = "lastServiceCheck")
    private DateTime lastServiceCheck;
    @Column(name = "licencePlate", nullable = false)
    private String licencePlate;
}
