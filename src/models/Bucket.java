package models;

import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Bucket extends Misc implements Interactable, Runnable {
    private Color gripcolor;

    public Bucket(int x, int y) {
        super(x, y);
        baseColor = Color.rgb(255, 100, 24);
        gripcolor = Color.rgb(0,0,0);
    }

    @Override
    public void draw() {
        gc.setFill(baseColor);
        gc.fillRect(2,30,25,22);
        gc.setFill(gripcolor);
        gc.fillRect(2,10,25,5);
        gc.strokeLine(2,30, 0,10);
        gc.strokeLine(27,30, 27,10);
    }


    @Override
    public void response() {
        TranslateTransition tt = new TranslateTransition(Duration.seconds(0.5), this);
        tt.setFromY(this.getTranslateY());
        tt.setToY(280);
        tt.setCycleCount(4);
        tt.setAutoReverse(true);
        tt.play();
    }

    @Override
    public String locationOfItem() {
        return this.getTranslateX()+" "+this.getTranslateY();
    }

    @Override
    public void run() {
        draw();
    }
}
