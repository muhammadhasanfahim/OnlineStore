package com.boostmytool.onlinestore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boostmytool.onlinestore.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
