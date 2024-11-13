package com.jsf.bank.service;

import com.jsf.bank.pojo.Account;

/**
 * @Description
 * @FileName AccountService
 * @Author JSF
 * @date 2024-05-29
 **/
public interface AccountService {
    void transfer(String fromAvtno,String toActno,double money);
    void save(Account act);
}
