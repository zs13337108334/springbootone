package com.alibaba.controller;


import com.alibaba.domain.User;
import com.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zhangshuai
 * @date: 2021-05-11
 */

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/handler")
    public User orderController() {
        return orderService.OrderDetailById(1);
    }

    @RequestMapping("/selectAll")
    public List<User> selectAll(Integer pageNum, Integer countNum) {
        return orderService.selectAll(3, 5);
    }

}
