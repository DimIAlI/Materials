package org.example.FactoryMethod;

public class SwordFactory implements WeaponFactory{

    @Override
    public Weapon initWeapon() {
        return new Sword();
    }
}
