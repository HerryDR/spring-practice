package com.jsf.spring6.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @FileName SecurityAspect
 * @Author JSF
 * @date 2024-05-28
 **/
@Component
@Aspect
public class SecurityAspect {
    @Pointcut("execution(* com.jsf.spring6.biz..save*(..))")
    public void savePointcut(){}
    @Pointcut("execution(* com.jsf.spring6.biz..delete*(..))")
    public void deletePointcut(){}
    @Pointcut("execution(* com.jsf.spring6.biz..modify*(..))")
    public void modifyPointcut(){}

    @Before("savePointcut()||deletePointcut()||modifyPointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("XXX正在操作"+joinPoint.getSignature().getName()+"方法");
    }
}
