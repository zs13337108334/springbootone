package com.alibaba.service;

import com.alibaba.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;


public interface OrderService {
    String OrderDetailById(Long id);
}
