package com.hyl.domain;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.hyl.enums.SexEnum;
import lombok.Data;

@Data
//@TableName("tb_user")
public class User extends Model<User>{
    @TableId(type = IdType.AUTO)
    private Long id;
//    @TableField(value = "user_name")
    private String userName;
    @TableField(fill = FieldFill.INSERT)
    private String password;
    @TableField(select = false)
    private String name;
    private Integer age;
    private String email;
    @TableField(exist = false)
    private String addr;
//    逻辑删除字段
//    @TableLogic
    private Integer deleted;
//   通用枚举
    private SexEnum Sex;
//    乐观锁
    @Version
    private Integer version;
}
