package com.jsf.simple.factory;

/**
 * @Description
 * @FileName WeaponFactory
 * @Author JSF
 * @date 2024-05-09
 **/
public class WeaponFactory {
    public static Weapon get(String weaponType){
        if (weaponType.equals("TANK")){
            return new Tank();
        } else if (weaponType.equals("FIGHTER")) {
            return new Fighter();
        } else if (weaponType.equals("DAGGER")) {
            return new Dagger();
        }else {
            throw new RuntimeException("不支持该武器");
        }
    }
}
