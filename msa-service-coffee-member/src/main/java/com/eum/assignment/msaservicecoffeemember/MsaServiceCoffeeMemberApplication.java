package com.eum.assignment.msaservicecoffeemember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class MsaServiceCoffeeMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaServiceCoffeeMemberApplication.class, args);
    }

}
