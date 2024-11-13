package com.jsf.proxy.service.impl;

import com.jsf.proxy.service.OrderService;

/**
 * @Description
 * @FileName OrderServiceImpl
 * @Author JSF
 * @date 2024-05-27
 **/
public class OrderServiceImpl implements OrderService {
    @Override
    public void generate() {
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已完成");
    }

    @Override
    public void detail() {
        try {
            Thread.sleep(1145);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单信息如下：*******");

    }

    @Override
    public void modify() {
        try {
            Thread.sleep(1212);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已修改");

    }
}
