package com.rayhuc.service.Impl;

import com.rayhuc.mapper.UserMapper;
import com.rayhuc.domain.User;
import com.rayhuc.service.UserService;
import com.rayhuc.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(String username, String password) {
        User user = userMapper.queryByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
