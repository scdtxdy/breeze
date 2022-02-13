package com.breeze.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sys_user")
public class User {

    @TableId
    private Long id;

//    @TableField("nickname")
    private String nickname;
    private Integer age;
    private String email;


}
