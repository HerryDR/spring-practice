package com.jsf.factory.method;

/**
 * @Description
 * @FileName DaggerFactory
 * @Author JSF
 * @date 2024-05-09
 **/
public class DaggerFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Dagger();
    }
}
