package com.baanBaini.commons.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;;

public class Product {
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
