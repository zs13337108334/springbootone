package com.alibaba.service.order.impl;

import com.alibaba.dao.OrderDao;
import com.alibaba.service.order.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangshuai
 * @date 2022/12/01
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public String orderDetailById(Long id) {
        if (id != null) {
            log.info("入参 id:{}", id);
            String str = orderDao.OrderDetailById(id);
            log.info("返回值 str:{}", str);
            return str;
        } else {
            return "查询失败";
        }
    }
}

