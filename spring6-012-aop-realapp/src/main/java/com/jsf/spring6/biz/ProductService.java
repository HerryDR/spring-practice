package com.jsf.spring6.biz;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @FileName ProductService
 * @Author JSF
 * @date 2024-05-28
 **/
@Component
public class ProductService {
    public void getProduct(){
        System.out.println("获取商品信息");
    }
    public void saveProduct(){
        System.out.println("保存商品信息");
    }
    public void modifyProduct(){
        System.out.println("修改商品信息");
    }
    public void deleteProduct(){
        System.out.println("删除商品信息");
    }
}
