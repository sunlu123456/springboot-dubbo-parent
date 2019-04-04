package com.sl.business.mybatis;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sl.dao.mybatis.StuDao;
import com.sl.pojo.mybatis.Stu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Slf4j
public class StuService {

    @Autowired
    private StuDao stuDao;

    public List<Stu> findAll(){
        return stuDao.findAll();
    }

    public List<Stu> selectByStu(Stu stu){
        return stuDao.selectByName(stu);
    }

    /**
     * PageHelper分页
     * @return
     */
    public PageInfo<Stu> selectByName(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        Stu stu = new Stu();
        stu.setName("马云");//条件查询
        List<Stu> stus = stuDao.selectByName(stu);
        PageInfo<Stu> pageInfo = new PageInfo<Stu>(stus);
        return pageInfo;
    }


    @Transactional(rollbackFor = Exception.class)
    public int modify(int id , String address){
        Stu stu = stuDao.selectByPrimaryKey(id);
        stu.setAddress(address);
        return stuDao.updateByPrimaryKeySelective(stu);
    }

    @Transactional(rollbackFor = Exception.class)
    public int save(Stu stu){
        return stuDao.insert(stu);
    }

    public String sayHello(String name) {
        return "hello！"+name+",Welcome to springboot-dubbo！";
    }

}
