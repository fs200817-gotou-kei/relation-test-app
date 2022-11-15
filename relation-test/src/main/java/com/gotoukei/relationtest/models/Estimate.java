package com.gotoukei.relationtest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "estimate")
@Data
public class Estimate {

    @Id
    @Column(name = "estimate_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_cd")
    private int productCd;

    @Column(name = "price")
    private int price;

    @Column(name = "quantity")
    private int quantity;
}
