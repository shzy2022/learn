package com.hyl.plugin;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.hyl.domain.User;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject,"password", String.class,"888888");

//        Object password = getFieldValByName("password", metaObject);
//        if(null == password){
//            //字段为空，可以进行填充
//            setFieldValByName("password", "123456", metaObject);
//        }

    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
