package com.jsf.factory.method;

/**
 * @Description
 * @FileName Test
 * @Author JSF
 * @date 2024-05-09
 **/
public class Test {
    public static void main(String[] args) {
        WeaponFactory weaponFactory1=new DaggerFactory();
        Weapon weapon1= weaponFactory1.get();
        weapon1.attack();

        WeaponFactory weaponFactory2=new GunFactory();
        Weapon weapon2= weaponFactory2.get();
        weapon2.attack();
    }
}
