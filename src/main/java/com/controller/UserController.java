package com.controller;

import com.bean.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username, String password, Model model){
        User user_t =new  User();
        user_t.setUser_name(username);
        user_t.setUser_password(password);
        User user = service.login(user_t);
        if(user!=null){  //数据库中含有用户，登录成功
            model.addAttribute("user",user);
            return "index";
        }else{  //数据库中没有用户,登陆失败
            return "login";
        }
    }
}
