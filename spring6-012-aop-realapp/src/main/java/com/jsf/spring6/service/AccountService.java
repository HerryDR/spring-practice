package com.jsf.spring6.service;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @FileName AccountService
 * @Author JSF
 * @date 2024-05-28
 **/
@Component
public class AccountService {
    public void transfer(){
        System.out.println("正在转账");
    }

    public void withdraw(){
        System.out.println("正在取款");
    }
}
