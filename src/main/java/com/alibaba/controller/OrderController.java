package com.alibaba.controller;


import com.alibaba.domain.User;
import com.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return orderService.OrderDetailById(0);
    }


}
