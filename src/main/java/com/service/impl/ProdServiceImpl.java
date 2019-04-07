package com.service.impl;

import com.bean.Product;
import com.bean.User;
import com.mapper.ProdMapper;
import com.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdServiceImpl implements ProdService {

    @Autowired
    private ProdMapper mapper;
    /*
    * 查询所有的商品
    * */
    public List<Product> findAllProduct() {
        return mapper.findAllProduct();
    }

    /*通过商品product_id查询商品*/
    public Product findById(String product_id){
        return mapper.findById(product_id);
    }

    /*修改商品基本信息*/
    public int motifiProduct(Product product){
        return mapper.motifiProduct(product);
    }

    //通过删除商品
    public int delete(String product_id){
        return mapper.delete(product_id);
    }

    //添加商品
    public int add(Product product){
        return mapper.add(product);
    }

    //通过product_like的关键字查询商品信息
    public List<Product> search(String product_like){
        return mapper.search(product_like);
    }
}
