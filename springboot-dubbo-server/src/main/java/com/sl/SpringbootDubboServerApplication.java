package com.sl;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig
//@EnableDubbo
@SpringBootApplication
@MapperScan("com.sl.dao.mybatis")
//@EntityScan(basePackages = {"com.sl.pojo.jpa"})//不在应用程序所在包及其子包时，来扫描和发现指定包及其子包中的Entity
//@EnableJpaRepositories(basePackages = {"com.sl.dao.jpa"})//不在应用程序所在包及其子包时，来扫描和发现指定包及其子包中的Repository
//@ImportResource({ "classpath:dubbo-server.xml" })
public class SpringbootDubboServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboServerApplication.class, args);
    }

}
