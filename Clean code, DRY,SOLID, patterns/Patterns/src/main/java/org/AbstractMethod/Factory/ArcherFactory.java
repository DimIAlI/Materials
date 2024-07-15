package org.example.AbstractMethod.Factory;

import org.example.AbstractMethod.Armor.Armor;
import org.example.AbstractMethod.Armor.LightArmor;
import org.example.AbstractMethod.Weapon.Bow;
import org.example.AbstractMethod.Weapon.Weapon;

public class ArcherFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public Armor createArmor() {
        return new LightArmor();
    }
}
