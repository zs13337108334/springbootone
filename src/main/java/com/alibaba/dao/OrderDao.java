package com.alibaba.dao;

import com.alibaba.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDao {

    /**
     * @param id
     * @return id对应的用户
     */
    @Select("select * from cpy where id = #{id}")
    public User findById(int id);

    /**
     * 需求：传3，7 实际查询 3-7的数据
     *
     * @param pageNum  第几页
     * @param countNum 每页显示多少条
     * @return 结果列表
     */
    @Select("SELECT * FROM cpy LIMIT #{pageNum},#{countNum}")
    List<User> selectAll(Integer pageNum, Integer countNum);

}

