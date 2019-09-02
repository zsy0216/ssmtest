package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackageName:com.ssm.controller
 * @Date:2019/8/16 9:07
 * @Author: zsy
 */

@Controller
public class UserController {

    /**
     * @Resource(name = "userService")
     */
    @Autowired
    UserService userService;

    /**
     * 查询所有用户
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String index(Model model) {
        List<User> users = userService.selectAll();
        model.addAttribute("users", users);
        return "users";
    }

    /**
     * 转发到添加用户的视图
     */
    @RequestMapping("/addUserView")
    public String addUserView() {
        return "add";
    }

    /**
     * 添加用户
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(User user) {
        userService.addUser(user);
        return "redirect:/users";
    }

    /**
     * 获取所要修改用户的信息
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String updateUserView(@PathVariable("id") Integer id, Model model) {
        User user = userService.getOneUserById(id);
        model.addAttribute("user", user);
        return "updateUserView";
    }

    /**
     * 修改用户信息
     */
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUser(User user) {
        userService.updateUser(user);
        return "redirect:/users";
    }

    /**
     * 删除用户
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }


}
