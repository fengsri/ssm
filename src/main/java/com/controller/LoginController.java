package com.controller;

import com.bean.Product;
import com.bean.User;
import com.service.LoginService;
import com.service.ProdService;
import com.sun.deploy.net.HttpRequest;
import org.omg.CORBA.ServerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.SessionScope;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class LoginController {

    //自动注入登陆service
    @Autowired
    private LoginService loginService;

    //查询所有的商品的service
    @Autowired
    private ProdService prodService;

    //到登陆页面
    @RequestMapping("/tologin")
    public String toLogin(){
        return "login";
    }

    //通过用户名和密码进行登陆
    @RequestMapping(value = "/userlogin",method = RequestMethod.POST)
    private String login(User u, Model model, HttpServletRequest request ){
        User user = loginService.login(u);   //通过用户名密码进行查询，如果查询到用户，将用户信息返回，如果没有查询到返回为空
        if(user!=null){  //登陆成功
            request.getSession().setAttribute("loginUser",user);//用session保存当前登陆用户
            List<Product> productList = prodService.findAllProduct();//所有的商品
            model.addAttribute("productList",productList);
            return "index";   //跳转到index页面，带有user信息
        }else{
            return "error";  //登陆失败
        }
    }

    //到注册页面
    @RequestMapping("/toregist")
    public String toRegist(){
        return "regist";
    }

    //用户信息进行注册
    @RequestMapping(value = "/userregist",method = RequestMethod.POST)
    public String regist(User user){
        int i = loginService.regist(user);
        if(i!=0){  //注册成功,跳转到登陆界面
            return "login";
        }else{   //注册失败，跳转到失败界面
            return "error";
        }
    }

}
