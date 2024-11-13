package com.jsf.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description
 * @FileName TimerInvocationHandler
 * @Author JSF
 * @date 2024-05-27
 **/
public class TimerInvocationHandler implements InvocationHandler {

    private Object target;

    public TimerInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long begin=System.currentTimeMillis();
        Object retValue=method.invoke(target,args);
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-begin+"秒"));

        return retValue;
    }
}
