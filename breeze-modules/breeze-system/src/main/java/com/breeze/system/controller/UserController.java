package com.breeze.system.controller;

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
    private Testutil testutil;
    @GetMapping("/test/a")
    public String test() {
        User user = userMapper.selectById(1l);
        User user1 = userMapper.getById(1l);
        String a = Contanttest.a;
        return testutil.utilstest(a);
    }
}
