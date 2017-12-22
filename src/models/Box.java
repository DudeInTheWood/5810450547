package models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Box extends Misc {

    public Box(int x, int y) {
        super(x, y);
        this.baseColor = Color.rgb(170, 121, 65);
    }

    @Override
    public void draw() {
        drawBox();
    }

    public void drawBox(){
        gc.setFill(baseColor);
        gc.fillRect(60,60,40,40);
        gc.strokeLine(60,60,100,100);
        gc.strokeLine(100,60,60,100);
    }
}
