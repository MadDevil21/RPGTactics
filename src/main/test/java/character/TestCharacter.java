package character;

import org.academiadecodigo.haltistas.character.Character;
import org.academiadecodigo.haltistas.character.CharacterFactory;
import org.academiadecodigo.haltistas.character.CharacterType;


public class TestCharacter {

    public static void main(String[] args) {
        TestCharacter testCharacter = new TestCharacter();

        testCharacter.startGame();
    }


    private Character[] enemyArray = new Character[10];

    public Character[] createEnemies() {
        for (int i = 0; i < enemyArray.length; i++) {

            if (i % 2 == 0) {
                enemyArray[i] = CharacterFactory.getNewCharacter(CharacterType.WARRIOR);
                continue;
            }
            enemyArray[i] = CharacterFactory.getNewCharacter(CharacterType.WIZARD);
        }

        return enemyArray;
    }


    public void startGame() {

        Character[] enemies = createEnemies();
        Character warrior = CharacterFactory.getNewCharacter(CharacterType.WARRIOR);

        for (int i = 0; i < enemies.length; i++) {

            while (enemies[i].isAlive()) {
                System.out.println("Enemy " + i + " " + enemies[i].getHealth());
                warrior.hitCharacter(enemies[i]);
            }

        }

    }


}
