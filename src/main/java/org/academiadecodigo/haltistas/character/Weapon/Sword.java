package org.academiadecodigo.haltistas.character.Weapon;

public class Sword extends Weapon {


    public Sword(int weaponDamage) {
        super(weaponDamage);
    }



    @Override
    public int getWeaponDamage() {
        return weaponDamage;
    }
}
