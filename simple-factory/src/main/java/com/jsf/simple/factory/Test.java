package com.jsf.simple.factory;

/**
 * @Description
 * @FileName Test
 * @Author JSF
 * @date 2024-05-09
 **/
public class Test {
    public static void main(String[] args) {
        Weapon weapon=WeaponFactory.get("DAGGER");
        weapon.attack();
    }

}
