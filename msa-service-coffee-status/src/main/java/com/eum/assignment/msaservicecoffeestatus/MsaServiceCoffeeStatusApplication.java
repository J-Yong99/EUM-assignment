package com.eum.assignment.msaservicecoffeestatus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MsaServiceCoffeeStatusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaServiceCoffeeStatusApplication.class, args);
    }

}
