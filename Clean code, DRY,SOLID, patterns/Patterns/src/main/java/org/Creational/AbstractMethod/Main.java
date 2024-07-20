package org.example.Creational.AbstractMethod;

import org.example.Creational.AbstractMethod.Armor.Armor;
import org.example.Creational.AbstractMethod.Armor.HeavyArmor;
import org.example.Creational.AbstractMethod.Factory.ArcherFactory;
import org.example.Creational.AbstractMethod.Factory.EquipmentFactory;
import org.example.Creational.AbstractMethod.Weapon.Weapon;

public class Main {

    public static void main(String[] args) {
        EquipmentFactory archerFactory = new ArcherFactory();
        Armor armor = archerFactory.createArmor();
        Weapon weapon = archerFactory.createWeapon();
        armor.takeDamage();
        weapon.doDamage();
    }
}
