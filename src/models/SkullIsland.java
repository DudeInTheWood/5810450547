package models;

import javafx.scene.paint.Color;

public class SkullIsland extends Misc implements Drawable{
    public SkullIsland(int x, int y) {
        super(x, y);
        setHeight(100);
        setWidth(100);
    }

    public void draw(){
        gc.setFill(Color.rgb(121, 102, 84));
        gc.fillOval(0,24,32+wSize,10+hSize);
        gc.setFill(Color.rgb(252, 240, 228));
        gc.fillOval(0,0,33+wSize,27+hSize);
        gc.fillRect(7,23,5+wSize,10+hSize);
        gc.fillRect(14,23,5+wSize,10+hSize);
        gc.fillRect(21,23,5+wSize,10+hSize);
        gc.setFill(Color.BLACK);
        gc.fillOval(6,10,10+wSize,10+hSize);
        gc.fillOval(20,10,10+wSize,10+hSize);
    }
}
