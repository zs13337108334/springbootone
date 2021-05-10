package com.alibaba.service;

import com.alibaba.dao.OrderDao;
import com.alibaba.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired(required = false)
    private OrderDao orderDao;

    public User OrderDetailById(int id) {
        if(id != 0){
            return orderDao.findById(id);
        }
        return new User("查询","失败");
    }
}
