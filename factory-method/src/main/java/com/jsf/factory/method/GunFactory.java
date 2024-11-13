package com.jsf.factory.method;

/**
 * @Description
 * @FileName GunFactory
 * @Author JSF
 * @date 2024-05-09
 **/
public class GunFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Gun();
    }
}
