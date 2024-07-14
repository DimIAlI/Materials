package org.example.FactoryMethod;


import org.example.FactoryMethod.Factory.BowFactory;
import org.example.FactoryMethod.Factory.WeaponFactory;
import org.example.FactoryMethod.Weapon.Weapon;

public class Main {

    public static void main(String[] args) {

        WeaponFactory weaponFactory = new BowFactory();
        Weapon weapon = weaponFactory.initWeapon();
        weapon.doDamage();

    }
}
