package com.jsf.spring6.service;

import com.jsf.spring6.dao.CsDao;
import com.jsf.spring6.dao.UserDao;

/**
 * @Description
 * @FileName CustomerService
 * @Author JSF
 * @date 2024-05-08
 **/
public class CustomerService {

    private CsDao csDao;
    private UserDao userDao;

    public void doSome(){
        csDao.delete();
        userDao.save();
    }

    public void setCsDao(CsDao csDao) {
        this.csDao = csDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
