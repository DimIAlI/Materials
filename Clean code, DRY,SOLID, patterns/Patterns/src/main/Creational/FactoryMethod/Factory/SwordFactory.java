package org.example.Creational.FactoryMethod.Factory;

import org.example.Creational.FactoryMethod.Weapon.Sword;
import org.example.Creational.FactoryMethod.Weapon.Weapon;

public class SwordFactory extends WeaponFactory{

    @Override
    public Weapon initWeapon() {
        return new Sword();
    }
}
