package org.academiadecodigo.haltistas.character;

import org.academiadecodigo.haltistas.character.Weapon.Weapon;

public class CharacterFactory {


    public static Character getNewCharacter(CharacterType characterType) {


        if (characterType == CharacterType.WARRIOR) {
            Weapon warriorWeapon = CharacterType.WARRIOR.getWeapon();
            return new Warrior(warriorWeapon);
        }

        Weapon wizardWeapon = CharacterType.WIZARD.getWeapon();
        return new Wizard(wizardWeapon);
    }


}
