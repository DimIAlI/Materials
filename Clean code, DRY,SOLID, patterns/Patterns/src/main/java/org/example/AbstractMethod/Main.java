package org.example.AbstractMethod;

import org.example.AbstractMethod.Armor.Armor;
import org.example.AbstractMethod.Factory.ArcherFactory;
import org.example.AbstractMethod.Factory.EquipmentFactory;
import org.example.AbstractMethod.Weapon.Weapon;

public class Main {

    public static void main(String[] args) {
        EquipmentFactory equipmentFactory = new ArcherFactory();
        Armor armor = equipmentFactory.createArmor();
        Weapon weapon = equipmentFactory.createWeapon();
        armor.takeDamage();
        weapon.doDamage();
    }
}
