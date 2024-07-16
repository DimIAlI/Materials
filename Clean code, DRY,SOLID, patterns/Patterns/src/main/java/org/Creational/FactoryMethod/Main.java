package org.example.Creational.FactoryMethod;


import org.example.Creational.FactoryMethod.Factory.BowFactory;
import org.example.Creational.FactoryMethod.Factory.WeaponFactory;
import org.example.Creational.FactoryMethod.Weapon.Weapon;

public class Main {

    public static void main(String[] args) {

        WeaponFactory weaponFactory = new BowFactory();
        Weapon weapon = weaponFactory.initWeapon();
        weapon.doDamage();

    }
}
