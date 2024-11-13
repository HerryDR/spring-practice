package com.jsf.spring6.test;

import com.jsf.spring6.bean.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @FileName SpringInstantiationTest
 * @Author JSF
 * @date 2024-05-09
 **/
public class SpringInstantiationTest {
    @Test
    public void constructorTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }

    @Test
    public void simpleFactoryTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Vip vip = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vip);
    }

    @Test
    public void factoryMethodTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Order order=applicationContext.getBean("orderBean", Order.class);
        System.out.println(order);
    }

    @Test
    public void factoryBeanTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Person person=applicationContext.getBean("personBean", Person.class);
        System.out.println(person);
    }

    @Test
    public  void dateTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Student student = applicationContext.getBean("stuBean", Student.class);
        System.out.println(student);
    }
}
