package com.example.demo.Repository;

import com.example.demo.Models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
     Customer getCustomerByCustomerEmail(String customer_email);
}
