package models;

import javafx.scene.canvas.Canvas;

public abstract class Drawable extends Canvas{

    public Drawable(int x, int y) {
        setTranslateX(x);
        setTranslateX(y);

        setHeight(550);
        setWidth(850);
    }

    public void draw(){
    }

}
