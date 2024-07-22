package org.example.Creational.AbstractMethod.Armor;

public class HeavyArmor implements Armor {

    @Override
    public void takeDamage() {
        System.out.println("Heavy armor takes x damage");
    }
}
