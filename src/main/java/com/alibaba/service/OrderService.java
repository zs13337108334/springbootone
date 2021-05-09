package com.alibaba.service;

import com.alibaba.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;

    public String OrderDetailById(){
        if(orderDao.OrderDetailById()!= null){
            return orderDao.OrderDetailById();
        }
        return "查询失败";

    }
}
