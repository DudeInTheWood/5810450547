package models;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Player extends DrawObject implements Drawable, Runnable{
    private Color bodyColor = Color.rgb(255, 240, 221);
    private int speed = 3;

    public Player(int x, int y) {
        super(x, y);
        setWidth(100);
        setHeight(100);
    }
    public void setBodyColor(Color color) {
        this.bodyColor = color;
    }

    @Override
    public void draw(){
        drawHead();
        drawBody();
    }

    public void drawHead(){
        gc.setFill(bodyColor);
        gc.fillRect(10,10,30,30);
        gc.fillRect(15,40,10,2);
        gc.setFill(Color.BROWN);
        gc.fillRect(10,10, 30, 10);
        gc.setFill(Color.BLACK);
        gc.fillRect(12,20,5,5);
        gc.fillRect(35,20,5,5);
    }
    public void drawBody(){
        gc.setFill(bodyColor);
        gc.fillRect(5,42,30,40);
        gc.fillRect(0,42,5,30);
        gc.fillRect(35,42,5,30);
        gc.fillRect(25,95,10,10);
        gc.fillRect(5,95,10,10);
        gc.setFill(Color.rgb(0, 226, 26, 0.7843));
        gc.fillRect(5,80,30,10);
        gc.fillRect(5,80,10,15);
        gc.fillRect(25,80,10,15);
        gc.setFill(Color.rgb(255, 60, 173, 0.7843));
        gc.fillRect(5,105,12,5);
        gc.fillRect(25,105,12,5);

    }

    public void goUp() {
        setTranslateY(getTranslateY()-speed);
    }

    public void goDown() {
        setTranslateY(getTranslateY()+speed);
    }

    public void goRight() {
        setTranslateX(getTranslateX()+speed);
    }

    public void goLeft() {
        setTranslateX(getTranslateX()-speed);
    }


    @Override
    public void run() {
        draw();
    }
}
