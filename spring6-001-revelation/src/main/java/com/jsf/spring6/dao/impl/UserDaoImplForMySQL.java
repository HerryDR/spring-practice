package com.jsf.spring6.dao.impl;

import com.jsf.spring6.dao.UserDao;

/**
 * @Description
 * @FileName UserDaoImplForMySQL
 * @Author JSF
 * @date 2024-05-06
 **/
public class UserDaoImplForMySQL implements UserDao {


    @Override
    public void deleteById() {
        System.out.println("正在删除。。。");
    }
}
