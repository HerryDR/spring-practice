package com.jsf.factory.method;

/**
 * @Description
 * @FileName Gun
 * @Author JSF
 * @date 2024-05-09
 **/
public class Gun extends Weapon{
    @Override
    public void attack() {
        System.out.println("射击。。。");
    }
}
