package com.jsf.spring6.web;

import com.jsf.spring6.service.UserService;
import com.jsf.spring6.service.impl.UserServiceImpl;

/**
 * @Description 表示层
 * @FileName UserAction
 * @Author JSF
 * @date 2024-05-06
 **/
public class UserAction {
    UserService userService=new UserServiceImpl();

    public  void deleteRequest(){
        userService.deleteUser();
    }
}
