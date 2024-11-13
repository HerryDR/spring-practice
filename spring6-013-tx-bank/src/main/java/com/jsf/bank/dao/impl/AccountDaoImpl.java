package com.jsf.bank.dao.impl;

import com.jsf.bank.dao.AccountDao;
import com.jsf.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @FileName AccountDaoImpl
 * @Author JSF
 * @date 2024-05-29
 **/
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Override
    public Account selectByActno(String actno) {
        String sql="select actno,balance from t_act where actno=?";
        Account account=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Account.class),actno);
        return account;
    }

    @Override
    public int update(Account account) {
        String sql="update t_act set balance=? where actno=?";
        int count=jdbcTemplate.update(sql,account.getBalance(),account.getActno());
        return count;
    }

    @Override
    public int insert(Account act) {
        String sql="insert into t_act values(?,?)";
        return jdbcTemplate.update(sql,act.getActno(),act.getBalance());
    }
}
