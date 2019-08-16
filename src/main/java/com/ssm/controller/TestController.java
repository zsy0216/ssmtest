package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @PackageName:com.ssm.controller
 * @Date:2019/8/14 20:32
 * @Author: zsy
 */

@Controller
@RequestMapping("/")
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public String test() {
        List<User> userList = userService.selectAll();
        for (User user : userList) {
            System.out.println(user);
        }
        return "test";
    }
}
