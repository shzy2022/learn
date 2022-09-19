package com.hyl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hyl.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao extends BaseMapper<User> {

    List<User> selectAll();
}
