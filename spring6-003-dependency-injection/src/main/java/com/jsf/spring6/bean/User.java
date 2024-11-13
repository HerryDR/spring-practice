package com.jsf.spring6.bean;

/**
 * @Description
 * @FileName User
 * @Author JSF
 * @date 2024-05-07
 **/
public class User {
    int age;

    //注入null
    String email;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
