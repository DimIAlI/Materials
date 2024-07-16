package org.example.Creational.FactoryMethod.Weapon;



public class Bow implements Weapon {

    @Override
    public void doDamage() {
        System.out.println("Лук нанес x урона");
    }
}
