package com.hyl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hyl.domain.User;
import java.util.List;
//接口名和对应的XML文件名要一致
public interface UserDao extends BaseMapper<User> {
//    方法名和xml里的id要一致
//    List<User> selectAll();
}
