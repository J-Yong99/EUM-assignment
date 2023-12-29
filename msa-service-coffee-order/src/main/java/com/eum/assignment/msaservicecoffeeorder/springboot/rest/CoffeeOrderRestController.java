package com.eum.assignment.msaservicecoffeeorder.springboot.rest;

import com.eum.assignment.msaservicecoffeeorder.domain.model.CoffeeOrderCVO;
import com.eum.assignment.msaservicecoffeeorder.springboot.messageq.KafkaProducer;
import com.eum.assignment.msaservicecoffeeorder.springboot.service.CoffeeOrderServiceImpl;
import com.eum.assignment.msaservicecoffeeorder.springboot.service.IMsaServiceCoffeeMember;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeOrderRestController {
    @Autowired
    private CoffeeOrderServiceImpl coffeeOrderServiceImpl;
    @Autowired
    private KafkaProducer kafkaProducer;
    @Autowired
    private IMsaServiceCoffeeMember iMsaServiceCoffeeMember;

    @HystrixCommand
    @PostMapping("/coffeeOrder")
    public ResponseEntity<CoffeeOrderCVO> coffeeOrder(
            @RequestBody CoffeeOrderCVO coffeeOrderCVO
    ) {

        // isMember
        if (iMsaServiceCoffeeMember.coffeeMember(coffeeOrderCVO.getCustomerName())) {
            System.out.println("coffeeOrderCVO.getCustomerName() = " + coffeeOrderCVO.getCustomerName());
        }

        // coffeeOrder
        coffeeOrderServiceImpl.coffeeOrder(coffeeOrderCVO);

        // kafka
        kafkaProducer.send("kafka-test", coffeeOrderCVO);

        return new ResponseEntity<>(coffeeOrderCVO, HttpStatus.OK);
    }
}
