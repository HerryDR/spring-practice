package com.jsf.myspring.test;

import com.jsf.myspring.bean.UserService;
import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

/**
 * @Description
 * @FileName MySpringTest
 * @Author JSF
 * @date 2024-05-10
 **/
public class MySpringTest {
    @Test
    public void testMySpring(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
        UserService userService= (UserService) applicationContext.getBean("userServiceBean");
        userService.save();
    }
}
