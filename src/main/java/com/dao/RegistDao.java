package com.dao;

import com.bean.User;

public interface RegistDao {
    /*
    * 根据用户名，查询用户是否在数据库存在
    * */
    public User getUserByName(User user);

    /*
    * 根据传过来的用户，保存到数据库
    * */
    public int registUser(User user);
}
