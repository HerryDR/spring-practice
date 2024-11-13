package com.jsf.spring6.test;

import com.jsf.spring6.biz.ProductService;
import com.jsf.spring6.biz.UserService;
import com.jsf.spring6.service.AccountService;
import com.jsf.spring6.service.OrderService;
import com.jsf.spring6.service.Spring6Configuration;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @FileName Test
 * @Author JSF
 * @date 2024-05-28
 **/
public class AOPTest {
    @Test
    public void testTransaction(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        AccountService accountService=applicationContext.getBean("accountService", AccountService.class);
        OrderService orderService=applicationContext.getBean("orderService", OrderService.class);

        accountService.transfer();
        accountService.withdraw();
        orderService.generate();
        orderService.cancel();
    }
    @Test
    public void testSecurity(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(com.jsf.spring6.biz.Spring6Configuration.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        ProductService productService = applicationContext.getBean("productService", ProductService.class);

        userService.getUser();
        userService.saveUser();
        userService.modifyUser();
        userService.deleteUser();
        productService.getProduct();
        productService.saveProduct();
        productService.modifyProduct();
        productService.deleteProduct();
    }

}
