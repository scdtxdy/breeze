package com.breeze.storage.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("storage")
public class Storage {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String productName;

    @TableLogic
    private Integer isDel;
}
