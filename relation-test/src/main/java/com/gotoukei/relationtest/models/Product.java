package com.gotoukei.relationtest.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @Column(name = "product_cd")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "price")
    private int price;

    // @OneToMany
    // @JoinColumn(name = "product_cd")
    // private List<Estimate> estimates;

}
