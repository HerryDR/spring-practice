package com.jsf.spring6.test;

import com.jsf.bank.pojo.Account;
import com.jsf.bank.service.AccountService;
import com.jsf.bank.service.impl.IsolationService1;
import com.jsf.bank.service.impl.IsolationService2;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @FileName BankTest
 * @Author JSF
 * @date 2024-05-29
 **/
public class BankTest {
    @Test
    public void testTransfer(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        AccountService accountService=applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-001","act-002",10000);
            System.out.println("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPropagation(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.save(new Account("act-003",1000.0));
    }

    @Test
    public void testIsolation1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        IsolationService1 i1 = applicationContext.getBean("i1", IsolationService1.class);
        i1.getByActno("act-005");
    }
    @Test
    public void testIsolation2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        IsolationService2 i2 = applicationContext.getBean("i2", IsolationService2.class);
        i2.save(new Account("act-005",1000.0));
    }
}
