package com.hyl.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_user")
public class User {
    private Long id;
    @TableField(value = "user_name")
    private String username;
    private String password;
    private String name;
    private Integer age;
    private String email;

}
