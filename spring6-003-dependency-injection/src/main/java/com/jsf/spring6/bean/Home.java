package com.jsf.spring6.bean;

import java.util.Arrays;

/**
 * @Description
 * @FileName Home
 * @Author JSF
 * @date 2024-05-08
 **/
public class Home {
    private User[] users;

    @Override
    public String toString() {
        return "Home{" +
                "users=" + Arrays.toString(users) +
                '}';
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
