package com.breeze.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.api.storage.RemoteStorageService;
import com.breeze.common.core.constant.Contanttest;
import com.breeze.common.core.domain.R;
import com.breeze.common.core.utils.Testutil;
import com.breeze.system.domain.User;
import com.breeze.system.mapper.UserMapper;
import com.breeze.system.service.UserService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RemoteStorageService remoteStorageService;

    @Autowired
    private Testutil testutil;

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    @GlobalTransactional // 重点 第一个开启事务的需要添加seata全局事务注解
    public String test() {
        //        User user = userMapper.selectById(1l);
//        User user1 = userMapper.getById(1l);
//        User user = new User();
//        user.setAge(29);
//        user.setEmail("eee");
//        user.setNickname("zjx");
//        userMapper.insert(user);
//        Long id = user.getId();
        R<String> data = remoteStorageService.getStorage();
        String storage = data.getData();
        System.out.println(storage);
        String a = Contanttest.a;
        return testutil.utilstest(a);
    }

    @Override
    public int remove() {
        int result = userMapper.deleteById(1493210932884254723l);
        System.out.println(String.valueOf(result));
        return result;
    }
}
