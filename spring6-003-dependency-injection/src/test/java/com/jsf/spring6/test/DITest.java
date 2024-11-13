package com.jsf.spring6.test;

import com.jsf.spring6.bean.*;
import com.jsf.spring6.jdbc.MyDataSource;
import com.jsf.spring6.jdbc.MyDataSource1;
import com.jsf.spring6.jdbc.MyDataSource2;
import com.jsf.spring6.service.CsService;
import com.jsf.spring6.service.CustomerService;
import com.jsf.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @FileName DITest
 * @Author JSF
 * @date 2024-05-07
 **/
public class DITest {
    @Test
    public void testSetDI(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService=applicationContext.getBean("userServiceBean",UserService.class);

        userService.save();
    }

    @Test
    public  void  testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CsService csService = applicationContext.getBean("csServiceBean", CsService.class);

        csService.delete();
    }

    @Test
    public void testInnerBean(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-inner-bean.xml");
        UserService userService=applicationContext.getBean("userServiceBean",UserService.class);

        userService.save();
    }
    @Test
    public void testSimpleType(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-simple-type.xml");
        User user=applicationContext.getBean("userBean", User.class);
        System.out.println(user);

        System.out.println("\n");

        SimpleValueType simpleValueType=applicationContext.getBean("simpleValueTypeBean", SimpleValueType.class);
        System.out.println(simpleValueType.toString());

    }

    @Test
    public void testDataSource(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-simple-type.xml");
        MyDataSource myDataSource=applicationContext.getBean("myDataSourceBean",MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testArraySimple(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-array.xml");

        Person person=applicationContext.getBean("personBean", Person.class);
        System.out.println(person);

        Home home=applicationContext.getBean("homeBean", Home.class);
        System.out.println(home);

    }

    @Test
    public void testCollection(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-collection.xml");

        People people=applicationContext.getBean("peopleBean",People.class);
        System.out.println(people);
    }

    @Test
    public void testNull(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-null.xml");
        User user=applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }

    @Test
    public void testP(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dog=applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dog);
    }

    @Test
    public void testC(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-c.xml");
        Dog dog=applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dog);
    }

    @Test
    public void testUtil(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-util.xml");
        MyDataSource1 myDataSource1=applicationContext.getBean("dsBean1",MyDataSource1.class);
        MyDataSource2 myDataSource2=applicationContext.getBean("dsBean2",MyDataSource2.class);
        System.out.println(myDataSource1);
        System.out.println(myDataSource2);
    }

    @Test
    public void testAutowireByName(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-autowire-byName.xml");
        UserService userService=applicationContext.getBean("userService", UserService.class);
        userService.save();
    }

    @Test
    public void  testAutowireByType(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-autowire-byType.xml");
        CustomerService  customerService=applicationContext.getBean("customerService", CustomerService.class);
        customerService.doSome();
    }

    @Test
    public void testProperties(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource myDataSource=applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }

}
