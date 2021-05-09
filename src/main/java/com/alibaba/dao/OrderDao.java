package com.alibaba.dao;


import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class OrderDao {
    public String OrderDetailById(){
        return "订单详情";
    }
}
