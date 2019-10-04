package com.example.demo.Services;

import com.example.demo.Models.Customer;
import com.example.demo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthentificationService {

    @Autowired
    private CustomerRepository customerRepository;

    public void registerCustomer(Customer customer){
        this.customerRepository.save(customer);
    }

    public Customer getCustomerByEmail(String mail){
        return this.customerRepository.getCustomerByCustomerEmail(mail);
    }

    public boolean login(Customer customer){
        Customer c=this.getCustomerByEmail(customer.getCustomerEmail());
        if(c!=null) {
            return
                    customer.getCustomer_pswd().equals(c.getCustomer_pswd());
        }
        else return false;
    }
}
