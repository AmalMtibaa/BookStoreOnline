package com.example.demo.Services;


import com.example.demo.Repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Models.Orderr;
import javax.transaction.Transactional;

@Transactional
@Service
public class OrderingService {

    @Autowired
    private OrderRepository orderRepository;

    public void createOrder(Orderr order ){
        this.orderRepository.save(order);
    }
}
