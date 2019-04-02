package com.controller;

import com.bean.User;
import com.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistController {
    @Autowired
    private RegistService service;

    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public String regist(User user){
        User u = service.getUserByName(user);
        if(u!=null){  //注册的用户名已经存在
            return "error";
        }else{   //用户名不存在
            int t = service.registUser(user);   //注册用户信息
            if(t!=0){   //注册成功，到登陆页面进行登陆
                return "login";
            }else{    //注册失败
                return "error";
            }
        }
    }
}
