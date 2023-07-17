package com.baanBaini.sellers.fiegnClients;

import com.baanBaini.commons.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "${warehouseServiceUrl}", value = "warehouseFeignClient", path = "products")
public interface WarehouseClient {
    @PostMapping
    ResponseEntity<Product> addProduct(@RequestBody Product product);
}
