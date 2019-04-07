package com.service;

import com.bean.User;

import java.util.List;

public interface UserManagerService {
    /*查询所有的用户*/
    public List<User> findAllUser();

    /*通过用户user_id查询用户*/
    public User findById(String user_id);

    /*修改用户基本信息*/
    public int motifiUser(User user);

    //通过用户user_id删除用户
    public int delete(String user_id);


    //添加用户
    public int add(User user);

}
