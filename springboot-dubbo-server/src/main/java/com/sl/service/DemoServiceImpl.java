package com.sl.service;

import com.sl.pojo.jpa.StuJpa;
import com.sl.pojo.mybatis.Stu;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@com.alibaba.dubbo.config.annotation.Service
@Slf4j
public class DemoServiceImpl implements DemoService{
//    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
    @Autowired
    private com.sl.business.jpa.StuJpaService stuService;
//    private com.sl.business.mybatis.StuService stuService;

    public String sayHello(String name) {
        log.info("=======dubbo调用接口========");
        log.info("Hello " + name + ", request from consumer" );
//        return "Hello " + name + ", response from provider" ;
        return stuService.sayHello(name);
    }
    public String saveStu(String name) {
        log.info("=======dubbo调用接口========");
//        Stu stu = Stu.builder().name(name).age(30).address("杭州").build();
        StuJpa stu = StuJpa.builder().name(name).age(30).address("杭州").build();
        int r=stuService.save(stu);
        if(r>0){
            return "保存成功";
        }
        return "保存失败";
    }
}
