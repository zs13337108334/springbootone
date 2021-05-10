package com.alibaba.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

@Getter
@Setter
public class User {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
