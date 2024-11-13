package com.jsf.spring6.service;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @FileName OrderService
 * @Author JSF
 * @date 2024-05-28
 **/
@Component
public class OrderService {
    public void generate(){
        System.out.println("正在生成订单");
    }
    public void cancel(){
        System.out.println("正在取消订单");
    }
}
