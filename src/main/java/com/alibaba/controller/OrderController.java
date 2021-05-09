package com.alibaba.controller;

import com.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/user")
    public String orderController(){
        return orderService.OrderDetailById() ;
    }
}
