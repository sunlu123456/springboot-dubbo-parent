package com.sl.controller;

import com.sl.service.DemoServiceComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
@RequestMapping("/test")
public class ClientController {
    @Autowired
    private DemoServiceComponent demoServiceComponent;
    @RequestMapping("/hello")
//    @ResponseBody
    public String say(){
        return demoServiceComponent.sayHello("world");
    }
}
