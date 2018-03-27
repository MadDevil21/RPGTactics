package org.academiadecodigo.haltistas.graphics;

import org.academiadecodigo.haltistas.util.Constants;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Map {

    private GraphicCharacter graphic;

    public Map() {

        Picture picture = new Picture(Constants.PADDING, Constants.PADDING, "src/main/resources/map.jpg");
        picture.draw();

    }

    public void init() {

        //just to see grid and check picture size
        new Grid().init();
        //graphic = new GraphicCharacter();
        //graphic.init();
    }
}
