package models;

import javafx.scene.paint.Color;

public class Skull extends Misc implements Drawable{
    public Skull(int x, int y) {
        super(x, y);
    }

    public void draw(){
        gc.setFill(Color.rgb(121, 102, 84));
        gc.fillOval(4,25,28,10);
        gc.setFill(Color.rgb(252, 240, 228));
        gc.fillOval(0,0,33,27);
        gc.fillRect(7,23,5,10);
        gc.fillRect(14,23,5,10);
        gc.fillRect(21,23,5,10);
        gc.setFill(Color.BLACK);
        gc.fillOval(6,10,10,10);
        gc.fillOval(20,10,10,10);
    }
}
