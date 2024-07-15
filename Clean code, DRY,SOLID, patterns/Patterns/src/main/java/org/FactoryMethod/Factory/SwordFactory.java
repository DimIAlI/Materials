package org.example.FactoryMethod.Factory;

import org.example.FactoryMethod.Weapon.Sword;
import org.example.FactoryMethod.Weapon.Weapon;

public class SwordFactory implements WeaponFactory{

    @Override
    public Weapon initWeapon() {
        return new Sword();
    }
}
