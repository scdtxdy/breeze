package com.breeze.system.controller;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusPropertiesCustomizer;
import com.breeze.commom.datasource.config.CustomIdGenerator;
import com.breeze.common.core.constant.Contanttest;
import com.breeze.common.core.utils.Testutil;
import com.breeze.system.domain.User;
import com.breeze.system.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MybatisPlusPropertiesCustomizer customizer;

    @Autowired
    private Testutil testutil;
    @GetMapping("/test/a")
    public String test() {
//        User user = userMapper.selectById(1l);
//        User user1 = userMapper.getById(1l);
        User user = new User();
        user.setAge(29);
        user.setEmail("eee");
        user.setNickname("zjx");
        userMapper.insert(user);
        Long id = user.getId();
        String a = Contanttest.a;
        return testutil.utilstest(a);
    }
}
