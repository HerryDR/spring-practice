package com.jsf.bank.dao;

import com.jsf.bank.pojo.Account;

/**
 * @Description
 * @FileName AccountDao
 * @Author JSF
 * @date 2024-05-29
 **/
public interface AccountDao {
    Account selectByActno(String actno);
    int update(Account account);
    int insert(Account act);

}
