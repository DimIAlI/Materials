package org.example.AbstractMethod.Factory;

import org.example.AbstractMethod.Armor.Armor;
import org.example.AbstractMethod.Weapon.Weapon;

public interface EquipmentFactory {

    Weapon createWeapon();

    Armor createArmor();

}
