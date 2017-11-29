package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public abstract class DrawObject extends Canvas{

    public DrawObject(int x, int y) {
        setTranslateX(x);
        setTranslateY(y);

        setHeight(550);
        setWidth(850);
    }

}
