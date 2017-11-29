package models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Box extends DrawObject implements Drawable {
    private GraphicsContext gc = getGraphicsContext2D();
    public Box(int x, int y) {
        super(x, y);
        setHeight(100);
        setWidth(100);
    }

    @Override
    public void draw() {
        drawBox();
    }

    public void drawBox(){
        gc.setFill(Color.rgb(170, 121, 65));
        gc.fillRect(60,60,40,40);
        gc.strokeLine(60,60,100,100);
        gc.strokeLine(100,60,60,100);
    }
}
