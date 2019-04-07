package com.bean;

public class Product {
    private int product_id;
    private String product_name;
    private String product_pic;
    private String product_dis;

    public Product() {
    }


    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_pic() {
        return product_pic;
    }

    public void setProduct_pic(String product_pic) {
        this.product_pic = product_pic;
    }

    public String getProduct_dis() {
        return product_dis;
    }

    public void setProduct_dis(String product_dis) {
        this.product_dis = product_dis;
    }
}
