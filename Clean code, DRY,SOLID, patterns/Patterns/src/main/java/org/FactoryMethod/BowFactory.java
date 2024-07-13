package org.example.FactoryMethod;

public class BowFactory implements WeaponFactory{
    @Override
    public Weapon initWeapon() {
        return new Bow();
    }
}
