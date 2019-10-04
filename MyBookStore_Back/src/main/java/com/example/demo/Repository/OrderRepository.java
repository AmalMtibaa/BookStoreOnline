package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Models.Orderr;
public interface OrderRepository extends CrudRepository<Orderr, Long> {
}
