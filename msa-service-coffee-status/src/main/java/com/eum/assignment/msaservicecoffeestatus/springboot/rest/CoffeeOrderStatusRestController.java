package com.eum.assignment.msaservicecoffeestatus.springboot.rest;

import com.eum.assignment.msaservicecoffeestatus.springboot.repository.jpa.IOrderStatusJpaRepository;
import com.eum.assignment.msaservicecoffeestatus.springboot.repository.jpa.OrderStatus;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoffeeOrderStatusRestController {
    @Autowired
    private IOrderStatusJpaRepository iOrderStatusJpaRepository;

    @HystrixCommand
    @GetMapping("/coffeeOrderStatus")
    public ResponseEntity<List<OrderStatus>> coffeeOrderStatus() {
        return ResponseEntity.ok(iOrderStatusJpaRepository.findAll());
    }

}
