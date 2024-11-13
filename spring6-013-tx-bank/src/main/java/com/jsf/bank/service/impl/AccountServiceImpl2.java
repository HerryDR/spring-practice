package com.jsf.bank.service.impl;

import com.jsf.bank.dao.AccountDao;
import com.jsf.bank.pojo.Account;
import com.jsf.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @FileName AccountService2
 * @Author JSF
 * @date 2024-05-29
 **/
@Service("accountService2")
public class AccountServiceImpl2 implements AccountService {
    @Resource(name = "accountDao")
    AccountDao accountDao;
    @Override
    public void transfer(String fromAvtno, String toActno, double money) {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Account act) {
        accountDao.insert(act);
        String s=null;
        System.out.println(s.toString());
    }
}
