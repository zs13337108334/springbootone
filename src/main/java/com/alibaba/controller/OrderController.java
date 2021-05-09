package com.alibaba.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("/handler")
    public String orderController() {
        return "ok";
    }
}
