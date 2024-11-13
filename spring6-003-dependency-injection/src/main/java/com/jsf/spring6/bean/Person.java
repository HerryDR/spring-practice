package com.jsf.spring6.bean;

import java.util.Arrays;

/**
 * @Description
 * @FileName Person
 * @Author JSF
 * @date 2024-05-08
 **/
public class Person {
    private String[] favoriteFoods;

    @Override
    public String toString() {
        return "Person{" +
                "favariteFoods=" + Arrays.toString(favoriteFoods) +
                '}';
    }

    public void setFavoriteFoods(String[] favariteFoods) {
        this.favoriteFoods = favariteFoods;
    }
}
