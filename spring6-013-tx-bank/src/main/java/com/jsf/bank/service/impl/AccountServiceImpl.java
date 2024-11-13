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
 * @FileName AccountServiceImpl
 * @Author JSF
 * @date 2024-05-29
 **/
@Transactional
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao accountDao;
    @Override
    public void transfer(String fromAvtno, String toActno, double money) {
        Account fromAct=accountDao.selectByActno(fromAvtno);
        if(fromAct.getBalance()<money)
            throw new RuntimeException("余额不足");
        Account toAct=accountDao.selectByActno(toActno);
        fromAct.setBalance(fromAct.getBalance()-money);
        toAct.setBalance(toAct.getBalance()+money);
        int count=accountDao.update(fromAct);

        //模拟异常
        /*String s=null;
        s.toString();*/

        count+=accountDao.update(toAct);
        if(count!=2)
            throw new RuntimeException("转账失败");
    }

    @Resource(name = "accountService2")
    AccountService accountService;
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Account act) {
        accountDao.insert(act);

        Account act2=new Account("act-004",1000.0);
        try {
            accountService.save(act2);
        } catch (Exception e) {

        }
    }
}
