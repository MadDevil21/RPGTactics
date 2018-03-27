package org.academiadecodigo.haltistas.character;

import org.academiadecodigo.haltistas.GameMessages;
import org.academiadecodigo.haltistas.character.Weapon.Weapon;

public class Character {

    private int health;
    private int speed;
    private int damage;
    private Weapon weapon;
    private boolean alive;

    public Character(Weapon weapon) {

        health = 100;
        speed = 3;
        damage = 10;
        this.weapon = weapon;
        alive = true;
    }


    public void damageTaken(int hitDamage) {

        if (health <= 0) {
            System.out.println(GameMessages.YOU_ARE_DEATH);
            alive = false;
            return;
        }

        health -= hitDamage;
    }


    public void hitCharacter(Character character) {

        character.damageTaken(doDamage(weapon));
    }


    public int doDamage(Weapon weapon) {

        return damage + weapon.getWeaponDamage();
    }


    public int moveCharacter() {

        return speed;
    }


    public boolean isAlive() {
        return alive;
    }

    public int getHealth() {
        return health;
    }
}
