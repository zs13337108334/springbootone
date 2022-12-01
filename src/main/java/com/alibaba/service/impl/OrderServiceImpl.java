package com.alibaba.service.impl;

import com.alibaba.dao.OrderDao;
import com.alibaba.domain.User;
import com.alibaba.service.OrderService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    private final Log log = LogFactory.getLog(OrderService.class);

    @Autowired
    private OrderDao orderDao;

    @Override
    public User OrderDetailById(int id) {
        if (id != 0) {
            log.info("OrderDetailById param:{} 查询成功");
            return orderDao.findById(id);
        }
        log.error("OrderDetailById param={} 查询失败！");

        return new User();
    }

    @Override
    public List<User> selectAll(Integer pageNum, Integer countNum) {

        //1.校验
        if (pageNum == 0 || pageNum == 1) {
            log.error("selectAll result={} 页数不能位0，请修改后重试！");
        }
        if (countNum == 0) {
            log.error("selectAll result={} 每页要查询条数不能位0，请修改后重试！");
        }

        //2.查询
        return orderDao.selectAll(pageNum - 1, countNum);
    }


}
