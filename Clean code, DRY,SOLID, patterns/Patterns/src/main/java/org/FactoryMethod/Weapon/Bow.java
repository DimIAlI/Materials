package org.example.FactoryMethod.Weapon;



public class Bow implements Weapon {

    @Override
    public void doDamage() {
        System.out.println("Лук нанес x урона");
    }
}
