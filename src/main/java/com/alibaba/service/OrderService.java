package com.alibaba.service;

import com.alibaba.dao.OrderDao;
import com.alibaba.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;

    public User OrderDetailById(int id) {

        return orderDao.findById(id);
    }
}
