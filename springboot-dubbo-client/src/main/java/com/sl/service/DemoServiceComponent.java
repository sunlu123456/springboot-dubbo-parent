package com.sl.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceComponent{
    @Reference
    private DemoService demoService;
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
