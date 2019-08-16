package com.ssm.service.impl;

import com.ssm.mapper.UserMapper;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName:com.ssm.service.impl
 * @Date:2019/8/15 21:58
 * @Author: zsy
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        List<User> userList = userMapper.selectAll();
        return userList;
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public User getOneUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }
}
