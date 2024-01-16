package com.example.spring_backend_ecommerce.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class OrdersDTO {
    private Integer ordersId;
    private String address;
    private Date date;
    private String phoneNumber;
    private Integer status;
    private String username;

}
