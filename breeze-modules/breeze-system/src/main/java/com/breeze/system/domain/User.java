package com.breeze.system.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("sys_user")
public class User {

    @TableId(type = IdType.AUTO)
    private Long id;

//    @TableField("nickname")
    private String nickname;
    private Integer age;
    private String email;

    @TableLogic
    private Integer isDel;


}
