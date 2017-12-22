package models;

import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class LifeRing extends Misc implements Runnable{
    private Color stripColor;

    public LifeRing(int x, int y) {
        super(x, y);
        this.baseColor = Color.rgb(255, 247, 216);
        this.stripColor = Color.rgb(218, 17, 1);

    }

    @Override
    public void draw(){
        gc.setFill(baseColor);
        gc.fillRect(180,0,20,10);
        gc.fillRect(180,30,20,10);
        gc.fillRect(165,10,10,20);
        gc.fillRect(205,10,10,20);
        gc.setFill(stripColor);
        gc.fillRect(170,5,10,10);
        gc.fillRect(200,5,10,10);
        gc.fillRect(200,25,10,10);
        gc.fillRect(170,25,10,10);
    }

    @Override
    public void run() {
        draw();
    }
}
