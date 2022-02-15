package com.breeze.system.mapper;

import com.breeze.commom.datasource.config.config.BreezeBaseMapper;
import com.breeze.system.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BreezeBaseMapper<User> {


    User getById(Long id);

}