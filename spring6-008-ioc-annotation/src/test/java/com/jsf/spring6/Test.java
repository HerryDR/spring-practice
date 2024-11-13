package com.jsf.spring6;

import com.jsf.spring6.config.Spring6Configuration;
import com.jsf.spring6.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @FileName Test
 * @Author JSF
 * @date 2024-05-11
 **/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.insert();
    }
}
