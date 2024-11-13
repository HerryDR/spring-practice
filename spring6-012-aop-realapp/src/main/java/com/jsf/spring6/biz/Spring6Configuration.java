package com.jsf.spring6.biz;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description
 * @FileName Spring5Configuration
 * @Author JSF
 * @date 2024-05-28
 **/
@Configuration
@ComponentScan("com.jsf.spring6.biz")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Spring6Configuration {
}
