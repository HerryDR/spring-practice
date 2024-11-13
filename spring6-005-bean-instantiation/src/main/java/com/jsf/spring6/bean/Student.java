package com.jsf.spring6.bean;

import java.util.Date;

/**
 * @Description
 * @FileName Student
 * @Author JSF
 * @date 2024-05-09
 **/
public class Student {
    private Date birth;

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                '}';
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
