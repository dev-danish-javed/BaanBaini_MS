package com.baanBaini.warehouse.repositories;

import com.baanBaini.warehouse.entities.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;


public interface ProductRepo extends MongoRepository<ProductEntity, Long> {
}
