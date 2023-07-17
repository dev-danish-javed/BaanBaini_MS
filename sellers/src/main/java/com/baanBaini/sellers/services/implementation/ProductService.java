package com.baanBaini.sellers.services.implementation;

import com.baanBaini.commons.models.Product;
import com.baanBaini.sellers.fiegnClients.WarehouseClient;
import com.baanBaini.sellers.services.IProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductServices {
    @Autowired
    WarehouseClient warehouseClient;
    @Override
    public Product addProduct(Product product) {
        return warehouseClient.addProduct(product).getBody();
    }
}
