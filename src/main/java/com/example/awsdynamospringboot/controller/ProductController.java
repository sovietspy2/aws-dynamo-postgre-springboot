package com.example.awsdynamospringboot.controller;

import com.example.awsdynamospringboot.model.Product;
import com.example.awsdynamospringboot.dynamoRepo.ProductRepository;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path = "/product/{id}")
    public Product findProduct(@PathVariable String id) {
        log.info(" / product/id api hit");
        return productRepository.findById(id).get();

    }

    @PostMapping(path = "/product")
    public Product createProduct(@RequestBody  Product product) {
        log.info(" / product api hit");
        return productRepository.save(product);

    }

}
