package com.jsf.spring6.bean;

/**
 * @Description
 * @FileName VipFactory
 * @Author JSF
 * @date 2024-05-09
 **/
public class VipFactory {
    public static Vip get(){
        return  new Vip();
    }
}
