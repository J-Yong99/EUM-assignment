//package com.eum.assignment.msaservicecoffeeorder.springboot.configuration;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
//import com.netflix.discovery.AbstractDiscoveryClientOptionalArgs;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class EurekaClientConfig {
//
//    @Autowired
//    private EurekaClientConfigBean eurekaClientConfigBean;
//
//    @Autowired(required = false)
//    private AbstractDiscoveryClientOptionalArgs<?> optionalArgs;
//
//    @PostConstruct
//    public void customize() {
//        eurekaClientConfigBean.setOptionalArgs(optionalArgs);
//    }
//}
