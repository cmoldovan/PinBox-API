package com.enginizer.model.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by CalinM on 11/19/2016.
 */
public class Rack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(name = "Identifier of the user")
    private int id;
    private RackType rackType;
    private Car car;
    @Column(name = "isFilled", nullable = false)
    private boolean isFilled;
    @Column(name = "letter", nullable = false)
    private String letter;
    @Column(name = "depth", nullable = false)
    private int depth;
}
