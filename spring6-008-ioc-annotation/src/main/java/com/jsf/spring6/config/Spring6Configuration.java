package com.jsf.spring6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @FileName Spring6Configuration
 * @Author JSF
 * @date 2024-05-11
 **/
@Configuration
@ComponentScan({"com.jsf.spring6.dao","com.jsf.spring6.service"})
public class Spring6Configuration {
}
