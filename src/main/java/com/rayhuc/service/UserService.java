package com.rayhuc.service;

import com.rayhuc.domain.User;

public interface UserService {

    User checkUser(String username,String password);
}
