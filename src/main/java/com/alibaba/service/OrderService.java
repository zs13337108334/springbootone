package com.alibaba.service;

import com.alibaba.dao.OrderDao;
import com.alibaba.domain.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final Log log = LogFactory.getLog(OrderService.class);

    @Autowired(required = false)
    private OrderDao orderDao;

    public User OrderDetailById(int id) {
        if (id != 0) {
            log.info("OrderDetailById param={} 查询成功");
            return orderDao.findById(id);
        }
        log.error("OrderDetailById param={} 查询失败！");
        return new User("查询", "失败");
    }
}
