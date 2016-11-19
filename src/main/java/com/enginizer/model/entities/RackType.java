package com.enginizer.model.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by CalinM on 11/19/2016.
 */
public class RackType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(name = "Identifier of the user")
    private int id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "width",nullable = false)
    private int width;
    @Column(name = "height", nullable = false)
    private int height;
}
