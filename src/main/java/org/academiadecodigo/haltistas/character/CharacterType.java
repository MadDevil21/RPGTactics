package org.academiadecodigo.haltistas.character;

import org.academiadecodigo.haltistas.character.Weapon.Rod;
import org.academiadecodigo.haltistas.character.Weapon.Sword;
import org.academiadecodigo.haltistas.character.Weapon.Weapon;

public enum CharacterType {

    WARRIOR(new Sword(20)),
    WIZARD(new Rod(20));

    private Weapon weapon;


    CharacterType(Weapon weapon) {

        this.weapon = weapon;
    }


    public Weapon getWeapon() {

        return weapon;
    }
}
