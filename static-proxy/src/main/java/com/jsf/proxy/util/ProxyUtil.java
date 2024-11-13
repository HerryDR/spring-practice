package com.jsf.proxy.util;

import com.jsf.proxy.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @Description
 * @FileName ProxyUtil
 * @Author JSF
 * @date 2024-05-27
 **/
public class ProxyUtil {
    public static Object newProxyInstance(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                                            target.getClass().getInterfaces(),
                                                            new TimerInvocationHandler(target));
    }
}
