package com.fujie.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fujie.common.entity.User;
import com.fujie.common.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping(value = "findUserById")
    public void findUserById(){
        User user = userService.findUserById(1);
        System.out.println(user);
    }
}
