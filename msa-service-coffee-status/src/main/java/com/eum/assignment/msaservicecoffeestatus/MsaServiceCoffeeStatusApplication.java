package com.eum.assignment.msaservicecoffeestatus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsaServiceCoffeeStatusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaServiceCoffeeStatusApplication.class, args);
    }

}
