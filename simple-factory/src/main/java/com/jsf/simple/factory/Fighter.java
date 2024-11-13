package com.jsf.simple.factory;

/**
 * @Description
 * @FileName Fighter
 * @Author JSF
 * @date 2024-05-09
 **/
public class Fighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("扔炸弹。。。");
    }
}
