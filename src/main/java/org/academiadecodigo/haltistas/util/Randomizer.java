package org.academiadecodigo.haltistas.util;

import java.util.Random;

public class Randomizer {

    public static int randomPos(int min, int max) {

        if (max < 0) {
            return 0;
        }

        Random r = new Random();
        return r.nextInt(((max - min) + 1) + min) * Constants.CELL_SIZE + Constants.PADDING;

    }
}
