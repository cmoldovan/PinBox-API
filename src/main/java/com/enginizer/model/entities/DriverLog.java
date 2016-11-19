package com.enginizer.model.entities;

import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by CalinM on 11/19/2016.
 */
public class DriverLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(name = "Identifier of the adress")
    private int id;
    @Column(name = "id")
    private Driver driver;
    private Car car;
    @Column(name = "loginTime")
    private DateTime loginTime;
    @Column(name = "logoutTime")
    private DateTime logoutTime;
    @Column(name = "nbOfKm")
    private int nbOfKm;
    @Column(name = "nbOfPickupPackages")
    private int nbOfPickupPackages;
    @Column(name = "nbOfDeliveredPackages")
    private int nbOfDeliveredPackages;
    private Route route;
}
