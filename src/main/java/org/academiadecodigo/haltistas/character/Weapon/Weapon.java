package org.academiadecodigo.haltistas.character.Weapon;

public abstract class Weapon {

   protected int weaponDamage;

    public Weapon(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }


    public abstract int getWeaponDamage();

}
