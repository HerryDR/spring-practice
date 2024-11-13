package com.jsf.spring6.bean;

/**
 * @Description
 * @FileName OrderFactory
 * @Author JSF
 * @date 2024-05-09
 **/
public class OrderFactory {
    public Order get(){
        return new Order();
    }
}
