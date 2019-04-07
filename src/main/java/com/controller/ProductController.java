package com.controller;

import com.bean.Product;
import com.bean.User;
import com.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProdService service;

    //到浏览商品界面
    @RequestMapping("/all")
    public String allProduct(Model model){
        List<Product> productList = service.findAllProduct();
        model.addAttribute("productList",productList);
        return "product";
    }


    //到修改页面
    //通过用户user_id查询用户基本信息
    @RequestMapping("/tomotifi")
    private String toMotifi(String product_id,Model model){
        Product product = service.findById(product_id);
        model.addAttribute("product",product);
        return "motifiproduct";
    }


    //修改商品信息
    @RequestMapping("/motifi")
    private String motifi(Product p,Model model){  //绑定的用户参数
        int i = service.motifiProduct(p);
        if(i!=0){
            Product product = service.findById(p.getProduct_id()+"");
            model.addAttribute("product",product);
            return "motifiproduct";
        }else{
            return "error";
        }
    }

    //删除商品通过product_id
    @RequestMapping("/delete")
    private String delete(String product_id,Model model){  //绑定的用户参数
        int i = service.delete(product_id);
        if(i!=0){  //删除成功
            List<Product> productList = service.findAllProduct();
            model.addAttribute("productList",productList);
            return "product";
        }else{
            return "error";
        }
    }


    //到添加页面
    @RequestMapping("/toadd")
    public String toAdd(){
        return "addproduct";
    }

    //添加商品
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Product product,Model model){
        int i = service.add(product);
        if(i!=0){  //添加成功
            List<Product> productList = service.findAllProduct();
            model.addAttribute("productList",productList);
            return "product";
        }else{
            return "error";
        }
    }

    //返回到首页
    @RequestMapping("/toindex")
    public String toIndex(Model model){
        List<Product> productList = service.findAllProduct();//所有的商品
        //  model.addAttribute("user",user);  //添加数据
        model.addAttribute("productList",productList);
        return "index";   //跳转到index页面，带有user信息
    }

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public String searchProduct(String product_like,Model model){
        List<Product> productList = service.search(product_like);
        model.addAttribute("productList",productList);
        return "showProduct";
    }

}
