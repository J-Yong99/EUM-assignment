package com.eum.assignment.msaservicecoffeeorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsaServiceCoffeeOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaServiceCoffeeOrderApplication.class, args);
	}

}
