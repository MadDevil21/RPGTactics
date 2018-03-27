package org.academiadecodigo.haltistas.graphics;

import org.academiadecodigo.haltistas.util.Constants;
import org.academiadecodigo.haltistas.util.Randomizer;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class GraphicCharacter {

    private Rectangle character;

    private int row;
    private int col;

    public void init() {

        row = Randomizer.randomPos(0, Constants.ROWS - 1);
        col = Randomizer.randomPos(0, 2);

        character = new Rectangle(col * Constants.CELL_SIZE + Constants.PADDING, row * Constants.CELL_SIZE + Constants.PADDING,
                Constants.CELL_SIZE, Constants.CELL_SIZE);
        character.fill();
    }

    public void moveUp() {
        row--;
        character.translate(0, -Constants.CELL_SIZE);
    }

    public void moveDown() {
        row++;
        character.translate(0, Constants.CELL_SIZE);
    }

    public void moveLeft() {
        col--;
        character.translate(-Constants.CELL_SIZE, 0);
    }

    public void moveRight() {
        col++;
        character.translate(Constants.CELL_SIZE, 0);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
