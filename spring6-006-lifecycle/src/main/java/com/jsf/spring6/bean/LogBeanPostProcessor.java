package com.jsf.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Description
 * @FileName LogBeanPostProcessor
 * @Author JSF
 * @date 2024-05-09
 **/
public class LogBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before方法执行，即将开始初始化");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after方法执行，已完成初始化");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
