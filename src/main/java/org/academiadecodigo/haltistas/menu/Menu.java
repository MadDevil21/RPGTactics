package org.academiadecodigo.haltistas.menu;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Menu extends AbstractMenu{

    public void init() {

        options = new Text[MenuOption.values().length];

        createBackground();
        createOptions();

        options[movePointer].setColor(Color.BLUE);
    }

    private void createOptions() {

        int yPos = INITIAL_Y_OPTION_POS;

        for (MenuOption option : MenuOption.values()) {

            yPos += OPTIONS_MARGIN;

            options[option.ordinal()] = createOption(yPos, option.getOption());
        }
    }
}
