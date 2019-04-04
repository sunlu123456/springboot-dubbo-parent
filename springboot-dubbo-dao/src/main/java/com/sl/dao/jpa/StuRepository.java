package com.sl.dao.jpa;

import com.sl.pojo.jpa.StuJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StuRepository extends JpaRepository<StuJpa, Long> {

    /**
     * 根据名字自定义方法
     * @param name
     * @param age
     * @return
     */
    @Query(value="select * from student u where name like %?% and age=?",nativeQuery=true)
    List<StuJpa> findByNameAndAge(String name, int age);

    @Query(value="select * from student where name like %?%" ,nativeQuery=true)
    List<StuJpa> findLikeName(String name);

}