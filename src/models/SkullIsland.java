package models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SkullIsland extends Misc{
    private Color landColor;

    public SkullIsland(int x, int y) {
        super(x, y);
        baseColor = Color.rgb(252, 240, 228);
        landColor = Color.rgb(121, 102, 84);
    }

    @Override
    public void draw(){
        gc.setFill(landColor);
        gc.fillOval(0,24,32,10);
        gc.setFill(baseColor);
        gc.fillOval(0,0,33,27);
        gc.fillRect(7,23,5,10);
        gc.fillRect(14,23,5,10);
        gc.fillRect(21,23,5,10);
        gc.setFill(landColor);
        gc.fillOval(6,10,10,10);
        gc.fillOval(20,10,10,10);
    }
}
