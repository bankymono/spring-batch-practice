package com.bankymono.spring_batch_practice.repository;

import com.bankymono.spring_batch_practice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
