package com.jsf.spring6.service;

import com.jsf.spring6.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @FileName UserService
 * @Author JSF
 * @date 2024-05-11
 **/
@Service
public class UserService {
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

    public void insert(){
        userDao.insert();
    }
}
