package com.alibaba.controller;


import com.alibaba.service.order.OrderService;
import com.alibaba.service.script.MouseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/**
 * @author zhangshuai
 * @date 2022/12/01
 */
@Slf4j
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    // http://127.0.0.1:8080/springboot/order
    @RequestMapping("/order")
    public String orderController(Long id) throws AWTException, InterruptedException {
        String result;
        try {
            // id应由前端传入后可进行替换
            //   result = orderService.OrderDetailById(id);
            result = orderService.orderDetailById(1L);
        } catch (Exception e) {
            log.error("orderController e:{},id:{}", e, id);
            return "查询异常 请查看日志";
        }
        return result;
    }

    // http://127.0.0.1:8080/springboot/sendGoods
    @RequestMapping("/sendGoods")
    public String sendGoodsController(Long id) {
        String result;
        try {
            // id应由前端传入后可进行替换
            //   result = orderService.OrderDetailById(id);
            result = orderService.orderDetailById(2L);
        } catch (Exception e) {
            log.error("sendGoodsController e:{},id:{}", e, id);
            return "查询异常 请查看日志";
        }
        return result;
    }

    // http://127.0.0.1:8080/springboot/receiveGoods
    @RequestMapping("/receiveGoods")
    public String receiveGoodsController(Long id) {
        String result;
        try {
            // id应由前端传入后可进行替换
            //   result = orderService.OrderDetailById(id);
            result = orderService.orderDetailById(3L);
        } catch (Exception e) {
            log.error("receiveGoodsController e:{},id:{}", e, id);
            return "查询异常 请查看日志";
        }
        return result;
    }

    @RequestMapping("/script")
    public String script() throws IOException, AWTException, InterruptedException {
//        MouseController m = new MouseController();
//        m.run();
//        return "病毒已植入完成" ;
        return "OK";
    }
}
