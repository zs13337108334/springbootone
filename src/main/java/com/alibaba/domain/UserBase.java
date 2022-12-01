package com.alibaba.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangshuai
 * @date 2022/12/01
 */
@Data
public class UserBase implements Serializable {

    private static final long serialVersionUID = 6887059152385753901L;

    /**
     * 用户id
     */
    private Long  userId;
}
