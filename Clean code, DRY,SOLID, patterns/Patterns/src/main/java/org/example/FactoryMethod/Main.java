package org.example.FactoryMethod;


public class Main {

    public static void main(String[] args) {

        WeaponFactory factory = new BowFactory();
        Weapon weapon = factory.initWeapon();
        weapon.doDamage();

    }
}
