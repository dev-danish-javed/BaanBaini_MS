package com.baanBaini.warehouse.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.multipart.MultipartFile;

@Document
public class ProductEntity {

    @Id
    @Getter
    @Setter
    private String productId;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private Integer price;

    @Getter
    @Setter
    private String[] imagesUrl;

    @Getter
    @Setter
    private MultipartFile[] images;

}
