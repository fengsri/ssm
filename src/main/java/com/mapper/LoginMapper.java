package com.mapper;

import com.bean.User;

public interface LoginMapper {
    /*
     * 通过用户名和密码登陆
     * */
    public User login(User user);



    /*
    * 注册用户信息
    * */
    public int regist(User user);
}
