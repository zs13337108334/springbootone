package com.alibaba.service.impl;

import com.alibaba.dao.OrderDao;
import com.alibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangshuai
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public String OrderDetailById(Long id) {
        if (id != null) {
            log.info("入参 id:{}", id);
            String str = orderDao.OrderDetailById(id);
            log.info("返回值 str:{}", str);
            return str;
        }else {
            return "查询失败";
        }
    }
}

