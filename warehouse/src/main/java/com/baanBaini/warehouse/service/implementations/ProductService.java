package com.baanBaini.warehouse.service.implementations;

import com.baanBaini.commons.models.Product;
import com.baanBaini.commons.utils.IdGenerator;
import com.baanBaini.commons.utils.Mapper;
import com.baanBaini.warehouse.entities.ProductEntity;
import com.baanBaini.warehouse.repositories.ProductRepo;
import com.baanBaini.warehouse.service.IProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    ProductRepo repository;
    Logger logger = LoggerFactory.getLogger(ProductService.class);
    @Override
    public Product addProduct(Product product) {
        logger.info("Warehouse product service");
        Mapper mapper = new Mapper();
        product.setProductId(IdGenerator.generateId(IdGenerator.EntityType.PRODUCT));
        ProductEntity savedEntity = repository.save(mapper.map(product, ProductEntity.class));
        return mapper.map(savedEntity, Product.class);
    }
}
