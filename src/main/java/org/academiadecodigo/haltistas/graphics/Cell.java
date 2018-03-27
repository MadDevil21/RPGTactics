package org.academiadecodigo.haltistas.graphics;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private Rectangle cell;
    private int col;
    private int row;


    public Cell(int col, int row) {

        this.col = col;
        this.row = row;

        cell = new Rectangle(Constants.PADDING + (col * Constants.CELL_SIZE), Constants.PADDING +
                (row * Constants.CELL_SIZE), Constants.CELL_SIZE, Constants.CELL_SIZE);

        cell.draw();
    }
}
