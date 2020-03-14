package com.fujie.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fujie.common.entity.User;
import com.fujie.common.service.HelloService;
import com.fujie.mapper.HellerMapper;
import com.fujie.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class HelloServiceImpl implements HelloService {

    @Autowired
    HellerMapper hellerMapper;

    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }


}
