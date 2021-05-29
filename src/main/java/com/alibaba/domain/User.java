package com.alibaba.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    public User() {
    }

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 部门
     */
    private String dept;

}
