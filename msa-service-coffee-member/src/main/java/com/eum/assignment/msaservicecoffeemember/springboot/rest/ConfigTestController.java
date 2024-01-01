package com.eum.assignment.msaservicecoffeemember.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigTestController {
    @Value("${msaconfig.greeting}")
    private String greeting;

    @GetMapping("/test")
    public String test() {
        return greeting;
    }
}
