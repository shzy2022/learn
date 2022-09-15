package com.hyl.test;

import com.hyl.dao.UserDao;
import com.hyl.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserTest {

    @Test
    public void selectAllTest() throws IOException {
        String resource = "mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

//        List<User> users = session.selectList("com.hyl.dao.UserDao.selectAll");
//        使用xml映射
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> users = userDao.selectAll();
        for(User user:users){
            System.out.println(users);
        }

    }
}
