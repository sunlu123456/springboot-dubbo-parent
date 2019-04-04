package com.sl.business.jpa;

import com.sl.dao.jpa.StuRepository;
import com.sl.pojo.jpa.StuJpa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Slf4j
public class StuJpaService {

    @Autowired
    private StuRepository stuRepository;


    @Transactional(rollbackFor = Exception.class)
    public int save(StuJpa stu){
        StuJpa stus = stuRepository.save(stu);
        if(null !=stus){
            return 1;
        }else{
            return 0;
        }
    }

    public List<StuJpa> findAll() {
        List<StuJpa> all = stuRepository.findAll();
        return all;
    }

    public String sayHello(String name) {
        return "hello！"+name+",Welcome to springboot-dubbo！";
    }
}
