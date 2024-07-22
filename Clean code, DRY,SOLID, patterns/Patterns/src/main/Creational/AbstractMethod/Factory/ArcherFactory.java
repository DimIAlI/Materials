package org.example.Creational.AbstractMethod.Factory;

import org.example.Creational.AbstractMethod.Armor.Armor;
import org.example.Creational.AbstractMethod.Armor.LightArmor;
import org.example.Creational.AbstractMethod.Weapon.Bow;
import org.example.Creational.AbstractMethod.Weapon.Weapon;

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
