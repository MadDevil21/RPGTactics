package org.academiadecodigo.haltistas.menu;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

import java.awt.*;

public abstract class AbstractMenu {

    public static final int PADDING = 10;
    protected static final int FONT_SIZE = 18;
    protected static final int FRAME_WIDTH = 150;
    protected static final int FRAME_HEIGHT = 100;
    protected static final int INITIAL_Y_OPTION_POS = 0;
    protected static final int OPTIONS_MARGIN = 25;

    protected int movePointer = 0;
    protected Text[] options;
    protected Font font;
    protected Rectangle background;
    protected Text optionText;


    public AbstractMenu() {

        font = new Font("Arial", Font.BOLD, FONT_SIZE);
    }

    protected void createBackground() {

        // todo: need to put correct x y in position
        background = new Rectangle(PADDING, PADDING, FRAME_WIDTH, FRAME_HEIGHT);
        background.draw();
    }

    protected Text createOption(int yPos, String option) {

        optionText = new Text(optionsXPos(), yPos, option, font);

        optionText.draw();
        optionText.setColor(Color.RED);

        return optionText;
    }

    protected int optionsXPos() {

        final int CORRECT_CENTER_POS = 50;

        return FRAME_WIDTH / 2 - CORRECT_CENTER_POS;
    }
}
