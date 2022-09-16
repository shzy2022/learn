package com.hyl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_user")
public class User {
    @TableId(type = IdType.NONE)
    private Long id;
    @TableField(value = "user_name")
    private String username;
    private String password;
    @TableField(select = false)
    private String name;
    private Integer age;
    private String email;
    @TableField(exist = false)
    private String addr;
}
