package com.jsf.bank.service.impl;

import com.alibaba.druid.sql.dialect.db2.ast.stmt.DB2SelectQueryBlock;
import com.jsf.bank.dao.AccountDao;
import com.jsf.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @FileName IsolationService
 * @Author JSF
 * @date 2024-05-30
 **/
@Service("i1")
public class IsolationService1 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public void getByActno(String actno){
        Account account=accountDao.selectByActno(actno);
        System.out.println("查到的信息为"+account);
    }
}
