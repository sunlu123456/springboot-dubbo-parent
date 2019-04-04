package com.sl;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@SpringBootApplication(scanBasePackages = "com.sl.controller")
//@com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig
//@EnableDubbo
@SpringBootApplication
//@ImportResource({ "classpath:dubbo-client.xml" })
public class SpringbootDubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboClientApplication.class, args);
    }

}
