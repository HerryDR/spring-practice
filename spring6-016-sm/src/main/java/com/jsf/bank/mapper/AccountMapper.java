package com.jsf.bank.mapper;

import com.jsf.bank.pojo.Account;

import java.util.List;

/**
 * @Description
 * @FileName AccountMapper
 * @Author JSF
 * @date 2024-11-12
 **/
public interface AccountMapper {
    /**
     * 保存账户
     * @param account
     * @return
     */
    int insert(Account account);

    /**
     * 根据账号删除账户
     * @param actno
     * @return
     */
    int deleteByActno(String actno);

    /**
     * 修改账户
     * @param account
     * @return
     */
    int update(Account account);

    /**
     * 根据账号查询账户
     * @param actno
     * @return
     */
    Account selectByActno(String actno);

    /**
     * 获取所有账户
     * @return
     */
    List<Account> selectAll();
}
