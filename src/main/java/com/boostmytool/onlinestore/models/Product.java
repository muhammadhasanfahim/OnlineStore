package com.boostmytool.onlinestore.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    private String brand;
    private String category;
    private String price;

    @Column(columnDefinition = "TEXT")
    private String description;
    private Date createdate;
    private String imageFileName;
}
