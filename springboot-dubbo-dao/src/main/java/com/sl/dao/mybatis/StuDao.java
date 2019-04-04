package com.sl.dao.mybatis;

import com.sl.pojo.mybatis.Stu;

import java.util.List;

public interface StuDao {
    long countByName(Stu stu);

    int deleteByPrimaryKey(Integer id);

    int insert(Stu stu);

    int insertSelective(Stu stu);

    List<Stu> selectByName(Stu stu);

    List<Stu> findAll();

    Stu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stu stu);

    int updateByPrimaryKey(Stu stu);
}