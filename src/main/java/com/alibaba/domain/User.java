package com.alibaba.domain;

import lombok.Data;

import java.io.Serializable;


/**
 * @author zhangshuai
 * @date 2022/12/01
 */
@Data
public class User extends UserBase implements Serializable {

    private static final long serialVersionUID = 2354884614657999274L;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private String age;
}
