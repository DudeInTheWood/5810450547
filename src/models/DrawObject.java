package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public abstract class DrawObject extends Canvas{
    protected GraphicsContext gc = getGraphicsContext2D();

    public DrawObject(int x, int y) {
        setTranslateX(x);
        setTranslateY(y);

        setHeight(100);
        setWidth(100);
    }

    abstract public void draw();
}
