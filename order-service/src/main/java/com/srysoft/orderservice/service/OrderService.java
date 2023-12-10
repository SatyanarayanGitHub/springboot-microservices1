package com.srysoft.orderservice.service;

import com.srysoft.orderservice.entity.Order;
import com.srysoft.orderservice.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    Logger logger = LoggerFactory.getLogger(OrderService.class);
    @Autowired
    private OrderRepository repository;


    public Order saveOrder(Order order) {
        return repository.save(order);
    }
}
