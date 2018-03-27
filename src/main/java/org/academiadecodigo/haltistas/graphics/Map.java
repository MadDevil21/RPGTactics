package org.academiadecodigo.haltistas.graphics;

import org.academiadecodigo.haltistas.util.Constants;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Map {

    public Map() {

        Picture picture = new Picture(Constants.PADDING, Constants.PADDING, "src/main/resources/map.jpg");
        picture.draw();

        //just to see grid and check picture size
        new Grid().init();
        new GraphicCharacter().init();
    }

    public void init() {

    }
}
