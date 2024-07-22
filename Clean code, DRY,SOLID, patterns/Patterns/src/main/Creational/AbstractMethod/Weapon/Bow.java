package org.example.Creational.AbstractMethod.Weapon;

public class Bow implements Weapon{

    @Override
    public void doDamage() {
        System.out.println("Bow does x damage");
    }
}
