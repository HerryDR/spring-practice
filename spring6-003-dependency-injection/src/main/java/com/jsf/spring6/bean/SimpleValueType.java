package com.jsf.spring6.bean;

/**
 * @Description
 * @FileName SimpleValueType
 * @Author JSF
 * @date 2024-05-07
 **/
public class SimpleValueType {

    private int age;
    private int age2;

    private boolean flag;
    private Boolean flag2;

    private char c;
    private Character c2;

    private Season season;

    private String username;

    private Class clazz;

    @Override
    public String toString() {
        return "SimpleValueType{" +
                "age=" + age +
                ", age2=" + age2 +
                ", flag=" + flag +
                ", flag2=" + flag2 +
                ", c=" + c +
                ", c2=" + c2 +
                ", season=" + season +
                ", username='" + username + '\'' +
                ", clazz=" + clazz +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setFlag2(Boolean flag2) {
        this.flag2 = flag2;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setC2(Character c2) {
        this.c2 = c2;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
