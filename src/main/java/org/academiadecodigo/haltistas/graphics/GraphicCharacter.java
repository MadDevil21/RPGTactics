package org.academiadecodigo.haltistas.graphics;

import org.academiadecodigo.haltistas.util.Constants;
import org.academiadecodigo.haltistas.util.Randomizer;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class GraphicCharacter {

    public void init() {

        Rectangle character = new Rectangle(Randomizer.randomPos(0, 2), Randomizer.randomPos(0, Constants.ROWS - 1),
                Constants.CELL_SIZE, Constants.CELL_SIZE);
        character.fill();
    }
}
