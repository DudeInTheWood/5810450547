package models;

import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Bucket extends DrawObject implements Interactable, Runnable {
    private GraphicsContext gc = getGraphicsContext2D();
    private Color bucketColor = Color.rgb(255, 100, 24);

    public Bucket(int x, int y) {
        super(x, y);
        setHeight(200);
        setWidth(300);
    }

    public void draw() {
        gc.setFill(bucketColor);
        gc.fillRect(2,30,25,22);
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
