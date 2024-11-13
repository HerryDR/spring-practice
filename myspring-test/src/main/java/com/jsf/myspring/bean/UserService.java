package com.jsf.myspring.bean;

/**
 * @Description
 * @FileName UserService
 * @Author JSF
 * @date 2024-05-10
 **/
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save(){
        System.out.println("开始保存");
        userDao.insert();
        System.out.println("保存结束");
    }
}
