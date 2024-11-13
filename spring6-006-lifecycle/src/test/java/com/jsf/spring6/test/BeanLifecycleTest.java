package com.jsf.spring6.test;

import com.jsf.spring6.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @FileName BeanLifecycleTest
 * @Author JSF
 * @date 2024-05-09
 **/
public class BeanLifecycleTest {
    @Test
    public void testBeanLifecycleSeven(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User user=applicationContext.getBean("userBean", User.class);
        System.out.println("4、使用Bean"+user);
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
}
