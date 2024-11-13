package com.jsf.spring6.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Description
 * @FileName FirstSpringTest
 * @Author JSF
 * @date 2024-05-07
 **/
public class FirstSpringTest {
    @Test
    public  void testFirst(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml","spring.xml");

        Object userBean=applicationContext.getBean("userBean");
        Object vipBean = applicationContext.getBean("vipBean");
        Date dateBeean=applicationContext.getBean("dateBean", Date.class);

        System.out.println(userBean);
        System.out.println(vipBean);
        System.out.println(dateBeean);
    }

    @Test
    public  void testBeginInitBean(){
        Logger logger= LoggerFactory.getLogger(FirstSpringTest.class);
        logger.info("\n我是一条日志信息");
    }

}
