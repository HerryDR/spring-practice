package com.jsf.spring6.service.impl;

import com.jsf.spring6.dao.UserDao;
import com.jsf.spring6.dao.impl.UserDaoImplForMySQL;
import com.jsf.spring6.service.UserService;

/**
 * @Description
 * @FileName UserServiceImpl
 * @Author JSF
 * @date 2024-05-06
 **/
public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImplForMySQL();
    @Override
    public void deleteUser() {
        userDao.deleteById();
    }
}
