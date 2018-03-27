package org.academiadecodigo.haltistas.character;

import org.academiadecodigo.haltistas.character.Weapon.Weapon;

public class CharacterFactory {


    public static Character getNewCharacter(CharacterType characterType) {

            Weapon weapon = characterType.getWeapon();
            return new Character(weapon);
    }


}
