package org.example.Creational.FactoryMethod.Factory;

import org.example.Creational.FactoryMethod.Weapon.Bow;
import org.example.Creational.FactoryMethod.Weapon.Weapon;

public class BowFactory implements WeaponFactory{
    @Override
    public Weapon initWeapon() {
        return new Bow();
    }
}
