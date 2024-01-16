package com.example.spring_backend_ecommerce.dto;

import lombok.Data;

@Data
public class OrderdetailDTO {
    private Integer orderdetailId;
    private Integer price;
    private Integer quantity;
    private Integer status;
    private Integer cartId;

}
