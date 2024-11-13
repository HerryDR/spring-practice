package com.jsf.bank.service.impl;

import com.jsf.bank.dao.AccountDao;
import com.jsf.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @FileName IsolationService2
 * @Author JSF
 * @date 2024-05-30
 **/
@Service("i2")
public class IsolationService2 {
    @Resource(name = "accountDao")
    AccountDao accountDao;

    @Transactional
    public void save(Account act){
        accountDao.insert(act);
        try {
            Thread.sleep(1000*20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
