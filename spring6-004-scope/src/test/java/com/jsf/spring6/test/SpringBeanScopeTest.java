package com.jsf.spring6.test;

import com.jsf.spring6.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @FileName SpringBeanScopeTest
 * @Author JSF
 * @date 2024-05-09
 **/
public class SpringBeanScopeTest {
    @Test
    public void testBeanScope(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-scope.xml");

        SpringBean springBean1=applicationContext.getBean("springBean", SpringBean.class);
        SpringBean springBean2=applicationContext.getBean("springBean", SpringBean.class);
        SpringBean springBean3=applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean1);
        System.out.println(springBean2);
        System.out.println(springBean3);

    }
}
