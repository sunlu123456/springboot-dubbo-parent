package com.sl.pojo.jpa;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "student")
public class StuJpa implements Serializable {

    @Id
    /*
    这里是hibernate的主键生成策略。oracle中需要 设置sequence，MySQL中则指定identity使用自增字段。具体请参考hibernate的配置
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private Integer age;

    @Column
    private String address;

}