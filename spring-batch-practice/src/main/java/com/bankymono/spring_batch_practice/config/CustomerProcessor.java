package com.bankymono.spring_batch_practice.config;

import com.bankymono.spring_batch_practice.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        if(customer.getCountry().equals("United States")){
            return customer;
        }
        return null;
    }
}
