package com.jsf.spring6.service;

import com.jsf.spring6.dao.UserDao;

/**
 * @Description
 * @FileName UserService
 * @Author JSF
 * @date 2024-05-07
 **/
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        userDao.save();

    }
}
