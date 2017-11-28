package models;

import javafx.scene.canvas.Canvas;

public abstract class Drawable extends Canvas{

    public Drawable(int x, int y) {
        setTranslateX(x);
        setTranslateX(y);

        setHeight(1000);
        setWidth(1000);
    }

    public void draw(){
    }

}
