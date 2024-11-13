package com.jsf.proxy.client;

import com.jsf.proxy.service.OrderService;
import com.jsf.proxy.service.OrderServiceProxy;
import com.jsf.proxy.service.TimerInvocationHandler;
import com.jsf.proxy.service.impl.OrderServiceImpl;
import com.jsf.proxy.util.ProxyUtil;

import java.lang.reflect.Proxy;

/**
 * @Description
 * @FileName Test
 * @Author JSF
 * @date 2024-05-27
 **/
public class Test {
    public static void main(String[] args) {
        OrderService target=new OrderServiceImpl();
        OrderService proxy= (OrderService) ProxyUtil.newProxyInstance(target);

        proxy.generate();
        proxy.detail();
        proxy.modify();
    }
}
