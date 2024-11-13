package com.jsf.spring6.bean;

import java.util.Date;

/**
 * @Description
 * @FileName Dog
 * @Author JSF
 * @date 2024-05-08
 **/
public class Dog {
    String name;
    int age;
    Date birth;

    public Dog(String name, int age, Date birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
