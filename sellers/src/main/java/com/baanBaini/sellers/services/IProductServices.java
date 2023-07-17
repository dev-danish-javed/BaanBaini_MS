package com.baanBaini.sellers.services;

import com.baanBaini.commons.models.Product;
import org.springframework.stereotype.Service;

@Service
public interface IProductServices {
    Product addProduct(Product product);
}
