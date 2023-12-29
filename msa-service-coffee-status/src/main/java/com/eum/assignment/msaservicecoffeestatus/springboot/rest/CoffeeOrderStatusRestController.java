package com.eum.assignment.msaservicecoffeestatus.springboot.rest;

import com.eum.assignment.msaservicecoffeestatus.springboot.repository.ICoffeeStatusMapper;
import com.eum.assignment.msaservicecoffeestatus.springboot.repository.dvo.OrderStatusDVO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeOrderStatusRestController {
    @Autowired
    ICoffeeStatusMapper iCoffeeStatusMapper;

    @HystrixCommand
    @PostMapping("/createOrderStatus")
    public ResponseEntity<OrderStatusDVO> coffeeOrderStatus() {
        OrderStatusDVO orderStatusDVO = iCoffeeStatusMapper.selectCoffeeOrderStatus();
        return ResponseEntity.ok(orderStatusDVO);
    }

    @PutMapping("/createStatusTable")
    public void createStatusTable() {
        iCoffeeStatusMapper.createStatusTable();
    }
}
