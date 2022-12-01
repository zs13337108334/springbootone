package com.alibaba.dao;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author zhangshuai
 */
@Component
public class OrderDao {
    public String OrderDetailById(Long id){
        //nothing to do
        if (id == 1) {
            return "订单详情";
        } else if (id == 2) {
            return "发货单详情";
        } else if (id == 3) {
            return "收货单详情";
        }
        return "其他详情";
    }
}
