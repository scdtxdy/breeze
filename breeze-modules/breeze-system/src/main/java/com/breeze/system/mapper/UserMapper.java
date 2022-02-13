package com.breeze.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.breeze.system.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {


    User getById(Long id);

}