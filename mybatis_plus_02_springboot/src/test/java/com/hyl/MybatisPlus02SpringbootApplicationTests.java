package com.hyl;

import com.hyl.dao.UserDao;
import com.hyl.domain.User;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlus02SpringbootApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
        List<User> users = userDao.selectList(null);
        for (User user:users
             ) {
            System.out.println(user);
        }
    }

}
