package org.example.Creational.AbstractMethod.Factory;

import org.example.Creational.AbstractMethod.Armor.Armor;
import org.example.Creational.AbstractMethod.Armor.HeavyArmor;
import org.example.Creational.AbstractMethod.Weapon.Sword;
import org.example.Creational.AbstractMethod.Weapon.Weapon;

public class WarriorFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }
}
