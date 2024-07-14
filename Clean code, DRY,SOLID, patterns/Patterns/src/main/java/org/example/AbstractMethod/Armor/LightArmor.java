package org.example.AbstractMethod.Armor;

public class LightArmor implements Armor {

    @Override
    public void takeDamage() {
        System.out.println("Light armor takes x damage");
    }
}
