package com.alibaba.dao;

import com.alibaba.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderDao {

    @Select("select * from cpy where id = #{id}")
    public User findById(int id);

}

