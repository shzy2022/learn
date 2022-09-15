package com.hyl.dao;

import com.hyl.domain.User;
import java.util.List;

public interface UserDao {

    List<User> selectAll();
}
