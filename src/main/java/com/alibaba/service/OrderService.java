package com.alibaba.service;

import com.alibaba.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    /**
     * @param id
     * @return id对应的用户
     */
    public User OrderDetailById(int id);

    /**
     * 分页查询
     *
     * @param pageNum  第几页
     * @param countNum 每页显示多少条
     * @return 结果列表
     */
    List<User> selectAll(Integer pageNum, Integer countNum);
}
