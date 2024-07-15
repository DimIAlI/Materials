package org.example.AbstractMethod.Factory;

import org.example.AbstractMethod.Armor.Armor;
import org.example.AbstractMethod.Armor.HeavyArmor;
import org.example.AbstractMethod.Weapon.Sword;
import org.example.AbstractMethod.Weapon.Weapon;

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
