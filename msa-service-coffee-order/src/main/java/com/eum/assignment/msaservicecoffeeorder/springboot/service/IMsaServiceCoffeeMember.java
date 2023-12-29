package com.eum.assignment.msaservicecoffeeorder.springboot.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("msa-service-coffee-member")
public interface IMsaServiceCoffeeMember {

    @GetMapping("/coffeeMember/v1.0/{memberName}")
    boolean coffeeMember(@PathVariable String memberName);
}
