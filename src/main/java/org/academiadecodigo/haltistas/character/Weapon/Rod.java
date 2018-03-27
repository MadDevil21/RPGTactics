package org.academiadecodigo.haltistas.character.Weapon;

public class Rod extends Weapon {

    public Rod(int weaponDamage) {
        super(weaponDamage);
    }


    @Override
    public int getWeaponDamage() {
        return weaponDamage;
    }
}
