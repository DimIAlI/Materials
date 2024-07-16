package org.example.Creational.AbstractMethod.Factory;

import org.example.Creational.AbstractMethod.Armor.Armor;
import org.example.Creational.AbstractMethod.Weapon.Weapon;

public interface EquipmentFactory {

    Weapon createWeapon();

    Armor createArmor();

}
