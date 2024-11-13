package com.jsf.proxy.service;

/**
 * @Description
 * @FileName OrderServiceProxy
 * @Author JSF
 * @date 2024-05-27
 **/
public class OrderServiceProxy implements OrderService{
    private OrderService target;

    public OrderServiceProxy(OrderService target) {
        this.target = target;
    }

    @Override
    public void generate() {
        long begin=System.currentTimeMillis();
        target.generate();
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }

    @Override
    public void detail() {
        long begin=System.currentTimeMillis();
        target.detail();
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }

    @Override
    public void modify() {
        long begin=System.currentTimeMillis();
        target.modify();
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }
}
