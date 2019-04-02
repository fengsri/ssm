package com.service;

import com.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface RegistService {

    /*
    * 用户名查询用户是否存在
    * */
    public User getUserByName(User user);

    /*
    * 保存用户信息
    * */
    public int registUser(User user);
}
