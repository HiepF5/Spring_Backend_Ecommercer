package com.example.spring_backend_ecommerce.dto;

import lombok.Data;

import java.sql.Date;
@Data
public class ReviewDTO {
    private Integer reviewId;
    private String comment;
    private Date date;
    private Integer rate;
    private Integer clothesId;

}
