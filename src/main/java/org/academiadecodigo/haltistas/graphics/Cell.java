package org.academiadecodigo.haltistas.graphics;

import org.academiadecodigo.haltistas.Collidable;
import org.academiadecodigo.haltistas.util.Constants;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell implements Collidable{

    private Rectangle cell;
    private int col;
    private int row;
    private boolean collidable;


    public Cell(int col, int row) {

        this.col = col;
        this.row = row;
        this.collidable = false;

        cell = new Rectangle(Constants.PADDING + (col * Constants.CELL_SIZE), Constants.PADDING +
                (row * Constants.CELL_SIZE), Constants.CELL_SIZE, Constants.CELL_SIZE);

        cell.draw();
    }

    @Override
    public boolean isCollidable() {
        return collidable;
    }

    @Override
    public void doCollide() {

    }

}
