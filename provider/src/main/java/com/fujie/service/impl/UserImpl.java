package com.fujie.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fujie.common.entity.User;
import com.fujie.common.service.UserService;
import com.fujie.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUserById(Integer id) {
        User user = userMapper.findUserById(id);
        System.out.println(user);
        return user;
    }
}
