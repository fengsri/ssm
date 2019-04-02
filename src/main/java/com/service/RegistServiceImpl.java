package com.service;

import com.bean.User;
import com.dao.RegistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistServiceImpl implements RegistService {
    @Autowired
    private RegistDao dao;
    public User getUserByName(User user) {
        return dao.getUserByName(user);
    }

    public int registUser(User user) {
        return dao.registUser(user);
    }
}
