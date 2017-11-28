package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public abstract class DrawObject extends Canvas{
    public GraphicsContext gc = getGraphicsContext2D();
    public int wSize = 0;
    public int hSize = 0;

    public DrawObject(int x, int y) {
        setTranslateX(x);
        setTranslateY(y);

        setHeight(550);
        setWidth(850);
    }
    public void SetSize(int w, int h){
        wSize = w;
        hSize = h;
    }

}
