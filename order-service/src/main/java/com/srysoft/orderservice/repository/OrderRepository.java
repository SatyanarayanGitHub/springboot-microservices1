package com.srysoft.orderservice.repository;

import com.srysoft.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Integer> {
}
