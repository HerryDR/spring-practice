package com.jsf.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @FileName TransactionAspect
 * @Author JSF
 * @date 2024-05-28
 **/
@Component
@Aspect
public class TransactionAspect {
    @Around("execution(* com.jsf.spring6.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        try {
            System.out.println("开启事务");
            proceedingJoinPoint.proceed();
            System.out.println("提交事务");
        } catch (Throwable e) {
            System.out.println("回滚事务");        }
    }
}
