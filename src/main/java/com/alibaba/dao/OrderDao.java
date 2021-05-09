package com.alibaba.dao;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class OrderDao {
    public String OrderDetailById(){
        return "订单详情";
    }
}
