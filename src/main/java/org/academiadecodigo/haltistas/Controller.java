package org.academiadecodigo.haltistas;

import org.academiadecodigo.haltistas.menu.Menu;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controller implements KeyboardHandler {

    private Menu menu;
    private Character character;

    public Controller(Menu menu) {
        this.menu = menu;
    }

    public void init() {

        Keyboard keyboard = new Keyboard(this);

        int[] keys = new int[]{

                KeyboardEvent.KEY_DOWN, KeyboardEvent.KEY_UP, KeyboardEvent.KEY_ENTER, KeyboardEvent.KEY_BACKSPACE
        };

        for (int key : keys) {

            KeyboardEvent event = new KeyboardEvent();
            event.setKey(key);
            event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(event);
        }
    }

    private void actionMenuController(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_UP:
                menu.moveUp();
                break;

            case KeyboardEvent.KEY_DOWN:
                menu.moveDown();
                break;

            default:
        }
    }

    private void playerController(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_UP:
                character.moveUp();
                break;

            case KeyboardEvent.KEY_DOWN:
                character.moveDown();
                break;

            case KeyboardEvent.KEY_LEFT:
                character.moveLeft();
                break;

            case KeyboardEvent.KEY_RIGHT:
                character.moveRight();
                break;

            default:
        }
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch(Launcher.gameState) {

            case MAIN_MENU:
                break;

            case ACTION_MENU:
                actionMenuController(keyboardEvent);
                break;

            case GAME:
                playerController(keyboardEvent);
                break;

            case QUIT:
                System.exit(0);
        }
    }

    @Override
    public void keyPressed(char c) {

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void keyBackspace() {

    }

    @Override
    public void keyEnter() {

    }
}
