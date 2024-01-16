package com.example.spring_backend_ecommerce.model.mapper;

import com.example.spring_backend_ecommerce.entity.Orders;
import com.example.spring_backend_ecommerce.model.dto.OrdersDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class OrderMappper {
    @Autowired
    private ModelMapper modelMapper;
    public OrdersDTO toordersDTO(Orders orders){
        OrdersDTO ordersDTO = modelMapper.map(orders, OrdersDTO.class);
        return ordersDTO;
    }
}
