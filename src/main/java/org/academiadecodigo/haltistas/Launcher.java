package org.academiadecodigo.haltistas;

import org.academiadecodigo.haltistas.menu.Menu;

public class Launcher {

    private Controller controller;

    public static void main(String[] args) {

        new Launcher().init();
    }

    private void init() {

        Menu menu = new Menu();
        controller = new Controller(menu);
        menu.init();
        controller.init();
    }
}
