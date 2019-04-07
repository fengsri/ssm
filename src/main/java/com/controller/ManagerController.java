package com.controller;
import com.bean.Product;
import com.bean.User;
import com.service.ProdService;
import com.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/guan")
public class ManagerController {

   @Autowired
   private UserManagerService userManagerService;

   @Autowired
   private ProdService prodService;

    //查询所有用户
    @RequestMapping("/all")
    private String allUser( Model model){
        List<User> userList  = userManagerService.findAllUser();
        model.addAttribute("userList",userList);
        return "user";
    }

    //通过用户user_id查询用户基本信息
    @RequestMapping("/tomotifi")
    private String toMotifi(String user_id,Model model){
        User user = userManagerService.findById(user_id);
        model.addAttribute("user",user);
        return "motifi";
    }

    //修改用户信息
    @RequestMapping("/motifi")
    private String motifi(User u,Model model){  //绑定的用户参数
        int i = userManagerService.motifiUser(u);
        if(i!=0){
            User user = userManagerService.findById(u.getUser_id()+"");
            model.addAttribute("user",user);
            return "motifi";
        }else{
            return "error";
        }
    }

    //删除用户通过user_id
    @RequestMapping("/delete")
    private String delete(String user_id,Model model){  //绑定的用户参数
        int i = userManagerService.delete(user_id);
        if(i!=0){  //删除成功
            List<User> userList  = userManagerService.findAllUser();
            model.addAttribute("userList",userList);
            return "user";
        }else{  //删除失败
            return "error";
        }
    }


    //到添加页面
    @RequestMapping("/toadd")
    public String toAdd(){
        return "adduser";
    }

    //添加用户
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(User user,Model model){
        int i = userManagerService.add(user);
        if(i!=0){  //添加成功
            List<User> userList  = userManagerService.findAllUser();
            model.addAttribute("userList",userList);
            return "user";
        }else{  //添加失败
            return "error";
        }
    }


    //返回到首页
    @RequestMapping("/toindex")
    public String toIndex(Model model){
        List<Product> productList = prodService.findAllProduct();//所有的商品
      //  model.addAttribute("user",user);  //添加数据
        model.addAttribute("productList",productList);
        return "index";   //跳转到index页面，带有user信息
    }


}
