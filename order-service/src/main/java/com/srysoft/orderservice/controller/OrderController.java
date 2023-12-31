package com.srysoft.orderservice.controller;

import com.srysoft.orderservice.entity.Order;
import com.srysoft.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/bookOrder")
    public Order bookOrder(@RequestBody Order order) {
        return service.saveOrder(order);
    }
}
