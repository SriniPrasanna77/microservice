package com.srini.microservices.limitsservice.controller;

import com.srini.microservices.limitsservice.bean.Limits;
import com.srini.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    Configuration limitConfig;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
//        return new Limits(1,1000);
        return new Limits(limitConfig.getMinimum(),limitConfig.getMaximum());
    }
}
