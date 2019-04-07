package com.service.impl;

import com.bean.User;
import com.mapper.UserManagerMapper;
import com.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagerServiceImpl implements UserManagerService {
    @Autowired
    private UserManagerMapper managerMapper;

    /*查询所有的用户*/
    public List<User> findAllUser() {
        return managerMapper.findAllUser();
    }

    /*通过用户user_id查询用户*/
    public User findById(String user_id){
        return managerMapper.findById(user_id);
    }

    /*修改用户基本信息*/
    public int motifiUser(User user){
        return managerMapper.motifiUser(user);
    }

    //通过用户user_id删除用户
    public int delete(String user_id){
        return managerMapper.delete(user_id);
    }

    //添加用户
    public int add(User user){
        return managerMapper.add(user);
    }
}
