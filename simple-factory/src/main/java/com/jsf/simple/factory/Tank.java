package com.jsf.simple.factory;

/**
 * @Description
 * @FileName Tank
 * @Author JSF
 * @date 2024-05-09
 **/
public class Tank extends Weapon{
    @Override
    public void attack() {
        System.out.println("开炮。。。");
    }
}
