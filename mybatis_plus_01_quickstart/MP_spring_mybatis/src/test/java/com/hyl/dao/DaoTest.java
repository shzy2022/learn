package com.hyl.dao;

import com.hyl.config.SpringConfig;
import com.hyl.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class DaoTest {
        @Autowired
        private UserDao userDao;

        @Test
        public void testSelectAll(){
            List<User> users = userDao.selectList(null);
            for (User user:users) {
                System.out.println(user);
            }
        }

}
