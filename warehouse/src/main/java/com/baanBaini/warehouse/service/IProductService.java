package com.baanBaini.warehouse.service;

import com.baanBaini.commons.models.Product;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {
    public Product addProduct(Product product);
}
