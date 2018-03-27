package org.academiadecodigo.haltistas;

import org.academiadecodigo.haltistas.graphics.GraphicCharacter;
import org.academiadecodigo.haltistas.graphics.Map;
import org.academiadecodigo.haltistas.menu.Menu;

public class Launcher {

    public static GameState gameState;

    private Controller controller;

    public static void main(String[] args) {

        new Launcher().init();
    }

    private void init() {

        gameState = GameState.GAME;

        Map map = new Map();
        map.init();
        Menu menu = new Menu();
        GraphicCharacter character = new GraphicCharacter();
        character.init();
        controller = new Controller(menu, character);
        menu.init();
        controller.init();
    }
}
