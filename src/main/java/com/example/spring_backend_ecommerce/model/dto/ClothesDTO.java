package com.example.spring_backend_ecommerce.dto;

import lombok.Data;

@Data
public class ClothesDTO {
    private Integer clothesId;
    private String brand;
    private String description;
    private String image;
    private Integer price;
    private Integer quantity;
    private Integer sold;
    private String title;
    private Integer categoryId;


}
