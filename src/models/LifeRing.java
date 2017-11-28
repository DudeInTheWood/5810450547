package models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class LifeRing extends Misc implements Drawable{

    public LifeRing(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(){
        gc.setFill(Color.rgb(255, 247, 216));
        gc.fillRect(480,300,20+wSize,10+hSize);
        gc.fillRect(480,330,20+wSize,10+hSize);
        gc.fillRect(465,310,10+wSize,20+hSize);
        gc.fillRect(505,310,10+wSize,20+hSize);
        gc.setFill(Color.rgb(218, 17, 1));
        gc.fillRect(470,305,10+wSize,10+hSize);
        gc.fillRect(500,305,10+wSize,10+hSize);
        gc.fillRect(500,325,10+wSize,10+hSize);
        gc.fillRect(470,325,10+wSize,10+hSize);
    }
}
