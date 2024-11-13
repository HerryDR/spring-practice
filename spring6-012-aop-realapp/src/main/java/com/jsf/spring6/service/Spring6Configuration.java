package com.jsf.spring6.service;

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
@ComponentScan("com.jsf.spring6.service")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Spring6Configuration {
}
