package com.baanBaini.sellers.controllers;

import com.baanBaini.commons.models.Product;
import com.baanBaini.sellers.services.implementation.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("products")
public class ProductsController {
    @Autowired
    ProductService productService;
    Logger logger = LoggerFactory.getLogger(ProductsController.class);
    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        logger.info("sellers product controller");
        return ResponseEntity.ok(productService.addProduct(product));
    }
}
