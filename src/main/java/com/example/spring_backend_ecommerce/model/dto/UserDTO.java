package com.example.spring_backend_ecommerce.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Integer userId;
    private String address;
    private String email;
    private String fullName;
    private String number;
    private String password;
    private String username;

}
