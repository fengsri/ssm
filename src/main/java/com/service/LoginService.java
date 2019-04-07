package com.service;

import com.bean.User;

public interface LoginService {

    /*
    * 通过用户名和密码登陆
    * */
    public User login(User user);

    /*
    * 注册用户信息
    * */
    public int regist(User user);
}
