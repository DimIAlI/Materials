package org.example.Creational.AbstractMethod;

import org.example.Creational.AbstractMethod.Armor.Armor;
import org.example.Creational.AbstractMethod.Factory.ArcherFactory;
import org.example.Creational.AbstractMethod.Factory.EquipmentFactory;
import org.example.Creational.AbstractMethod.Weapon.Weapon;

public class Main {

    public static void main(String[] args) {
        EquipmentFactory equipmentFactory = new ArcherFactory();
        Armor armor = equipmentFactory.createArmor();
        Weapon weapon = equipmentFactory.createWeapon();
        armor.takeDamage();
        weapon.doDamage();
    }
}
