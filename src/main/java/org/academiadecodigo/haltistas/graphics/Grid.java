package org.academiadecodigo.haltistas.graphics;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.LinkedList;
import java.util.List;


public class Grid {

    private List<Cell> cells;

    public Grid() {
        this.cells = new LinkedList<>();
    }

    public void init() {

        Rectangle rectangle = new Rectangle(Constants.PADDING, Constants.PADDING,
                Constants.COLS * Constants.CELL_SIZE, Constants.ROWS * Constants.CELL_SIZE);
        rectangle.draw();

        drawCells();
    }

    private void drawCells() {

        for (int col = 0; col < Constants.COLS; col++) {
            for (int row = 0; row < Constants.ROWS; row++) {
                cells.add(new Cell(col, row));
            }
        }
    }

}
