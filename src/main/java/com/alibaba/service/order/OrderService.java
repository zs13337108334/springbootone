package com.alibaba.service.order;

import com.alibaba.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;


public interface OrderService {
    String orderDetailById(Long id);
}
