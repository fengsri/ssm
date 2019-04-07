package com.service.impl;

import com.bean.User;
import com.mapper.LoginMapper;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper mapper;


    //登陆
    public User login(User user) {
        return mapper.login(user);
    }

    //注册
    public int regist(User user) {
        return mapper.regist(user);
    }
}
