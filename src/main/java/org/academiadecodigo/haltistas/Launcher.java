package org.academiadecodigo.haltistas;

import org.academiadecodigo.haltistas.menu.Menu;

public class Launcher {

    public static GameState gameState;

    private Controller controller;

    public static void main(String[] args) {

        new Launcher().init();
    }

    private void init() {

        gameState = GameState.MAIN_MENU;

        Menu menu = new Menu();
        controller = new Controller(menu);
        menu.init();
        controller.init();
    }
}
