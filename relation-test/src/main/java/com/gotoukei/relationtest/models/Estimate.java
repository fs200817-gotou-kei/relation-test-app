package com.gotoukei.relationtest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "product_cd")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "employee_cd")
    private Employee employee;

    @Column(name = "quantity")
    private int quantity;
}
