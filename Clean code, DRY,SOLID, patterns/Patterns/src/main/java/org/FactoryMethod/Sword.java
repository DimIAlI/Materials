package org.example.FactoryMethod;

public class Sword implements Weapon{
    @Override
    public void doDamage() {
        System.out.println("Меч нанес x урона");
    }
}
