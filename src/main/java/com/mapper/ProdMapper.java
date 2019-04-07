package com.mapper;

import com.bean.Product;
import com.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProdMapper {

    /*
    *查询所有商品
    * */
    public List<Product> findAllProduct();


    /*通过商品product_id查询商品*/
    public Product findById(String product_id);

    /*修改商品基本信息*/
    public int motifiProduct(Product product);

    //通过用户product_id删除
    public int delete(String product_id);

    //添加商品
    public int add(Product product);


    //通过product_like的关键字查询商品信息
    public List<Product> search(@Param("product_like")String product_like);

}
