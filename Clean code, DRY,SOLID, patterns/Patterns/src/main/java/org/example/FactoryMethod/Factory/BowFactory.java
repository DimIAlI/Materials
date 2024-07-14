package org.example.FactoryMethod.Factory;

import org.example.FactoryMethod.Weapon.Bow;
import org.example.FactoryMethod.Weapon.Weapon;

public class BowFactory implements WeaponFactory{
    @Override
    public Weapon initWeapon() {
        return new Bow();
    }
}
