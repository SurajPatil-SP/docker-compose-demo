package com.java.developer.transactionservice.repository;

import com.java.developer.transactionservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, String> {
}
