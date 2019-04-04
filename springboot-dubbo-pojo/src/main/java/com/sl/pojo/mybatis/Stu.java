package com.sl.pojo.mybatis;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Stu {
    private Integer id;

    private String name;

    private Integer age;

    private String address;

}