package com.hyl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hyl.dao.UserDao;
import com.hyl.domain.User;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
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


    @Test
    void TestInsert(){
        User user = new User();
        user.setUsername("huayang");
        user.setName("洋桑");
        user.setAge(22);
        user.setEmail("a.qq.com");
        user.setPassword("abc123");
//        user.setId(11L);
        user.setAddr("aaa");
        int res = userDao.insert(user);

        System.out.println(res);
        System.out.println(user);
    }

    @Test
    void UpdataByID(){
        User user = new User();
//        user.setId(1L);
        user.setUsername("dahuang");
        user.setName("喵桑");
        userDao.updateById(user);
    }

    @Test
    void Updata(){
//        User user = new User();
////        user.setId(1L);
//        user.setUsername("dahuang");
//        user.setName("喵桑");
//        QueryWrapper t = new QueryWrapper();
//        t.eq("user_name","lisi");
/*
        ### SQL: UPDATE tb_user  SET username=?,password=?      WHERE (id = ?)
        ### Cause: java.sql.SQLSyntaxErrorException: Unknown column 'username' in 'field list'

 */
        UpdateWrapper<User> t = new UpdateWrapper<>();
        t.set("user_name","laowang").set("password","112233").eq("id","4");
        userDao.update(null,t);
    }

    @Test
    void delete(){
        User u = new User();
        u.setUsername("huayang");
        u.setPassword("abc123");
        UpdateWrapper<User> t = new UpdateWrapper<>(u);
        userDao.delete(t);
    }

//    分页查询
    @Test
    void selecrpagetest(){
        Page<User> page = new Page(1,3);
        Page<User> userPage = userDao.selectPage(page, null);
        System.out.println("当前页"+userPage.getCurrent());
        System.out.println("页大小"+userPage.getSize());
        System.out.println("数据总数"+userPage.getTotal());
//        不知道干嘛用的----》order[]
//        System.out.println("order"+userPage.getOrders());
        System.out.println("页数"+userPage.getPages());

        for (User user:userPage.getRecords()
             ) {
            System.out.println(user);
        }
    }

}
