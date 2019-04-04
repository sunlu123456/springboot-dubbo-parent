package com.sl.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sl.service.DemoService;
import com.sl.service.DemoServiceComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
//@EnableAutoConfiguration
@RequestMapping("/test2")
public class ClientController2 {
    @Reference
    private DemoService demoService;

    @RequestMapping("/hello2")
    @ResponseBody
    public String say(){
        return demoService.sayHello("world2");
    }

    @RequestMapping("/save")
    @ResponseBody
    public String saveStu(@RequestParam(value = "name", required=true) String name ){
        return demoService.saveStu(name);
    }
}
