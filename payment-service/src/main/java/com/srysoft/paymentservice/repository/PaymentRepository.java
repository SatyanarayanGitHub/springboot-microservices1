package com.srysoft.paymentservice.repository;

import com.srysoft.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface PaymentRepository extends JpaRepository<Payment, CriteriaBuilder.In> {
}
