package com.boostmytool.onlinestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boostmytool.onlinestore.models.Product;
import com.boostmytool.onlinestore.models.ProductDTO;
import com.boostmytool.onlinestore.services.ProductRepository;


@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;


    @GetMapping({"","/"})
    public String showProductList(Model model){
        List<Product> products= repo.findAll();
        model.addAttribute("products", products);
        return "products/index";
    }

    @GetMapping("/create")
    public String showCreatePage(Model model){
        ProductDTO productDto = new ProductDTO();
        model.addAttribute("productDto", productDto);
        return "products/CreateProduct";
    }
}
