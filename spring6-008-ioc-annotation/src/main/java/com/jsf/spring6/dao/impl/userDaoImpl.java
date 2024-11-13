package com.jsf.spring6.dao.impl;

import com.jsf.spring6.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @FileName userDaoImpl
 * @Author JSF
 * @date 2024-05-11
 **/
@Repository("userDaoImpl1")
public class userDaoImpl implements UserDao {
    @Override
    public void insert() {
        System.out.println("插入中。。。");
    }
}
