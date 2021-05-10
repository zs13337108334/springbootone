package com.alibaba.domain;

import org.springframework.context.annotation.Bean;


public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public User() {
    }

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private String age;
}
