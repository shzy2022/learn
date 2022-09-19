package com.hyl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hyl.domain.User;
import com.hyl.enums.SexEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ActiveRecodeTest {
    @Test
    void TestSelectList(){
        User user = new User();
        List<User> users = user.selectList(null);
        for (User u : users) {
            System.out.println(u);
        }
    }

    @Test
    void TestInsert(){
        User user = new User();
        user.setName("汪桑");
        user.setAge(18);
        user.setUserName("dog");
        boolean insert = user.insert();
        System.out.println("result---->"+insert);
    }

    @Test
    void TestDeleteById(){
        User user = new User();
        user.setId(10L);
        boolean res = user.deleteById();
        System.out.println("result----->"+res);
    }

    @Test
    void TestUpdateById(){
        User user = new User();
        user.setId(2L);
        user=user.selectById();
        System.out.println("user------->"+user);
        user.setSex(SexEnum.WOMAN);
        user.setUserName("xiaomao");
        user.updateById();
        System.out.println("user------->"+user);
    }

    @Test
    void TestDelete(){
        User user = new User();
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.gt("id",6);
        user.delete(queryWrapper);
    }

}
