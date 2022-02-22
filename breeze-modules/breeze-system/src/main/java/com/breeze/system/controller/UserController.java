package com.breeze.system.controller;

import com.breeze.api.storage.RemoteStorageService;
import com.breeze.api.storage.domain.Storage;
import com.breeze.common.core.constant.Contanttest;
import com.breeze.common.core.domain.R;
import com.breeze.common.core.utils.Testutil;

import com.breeze.system.mapper.UserMapper;
import com.breeze.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String test() {
        return userService.test();
    }

    @GetMapping("/test/remove")
    public int remove() {
        return userService.remove();
    }
}
