package models;

import javafx.scene.paint.Color;

public class Player extends DrawObject implements Runnable{
    private Color bodyColor;
    private Color hairColor;
    private Color pantColor;
    private int step = 5;

    public Player(int x, int y) {
        super(x, y);
        this.pantColor = Color.rgb(255, 60, 173, 0.7843);
        this.bodyColor =  Color.rgb(255, 240, 221);
        this.hairColor = Color.rgb(0, 226, 26, 0.7843);

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
        gc.setFill(hairColor);
        gc.fillRect(5,80,30,10);
        gc.fillRect(5,80,10,15);
        gc.fillRect(25,80,10,15);
        gc.setFill(pantColor);
        gc.fillRect(5,105,12,5);
        gc.fillRect(25,105,12,5);

    }

    public void goUp() {
        setTranslateY(getTranslateY()- step);
    }

    public void goDown() {
        setTranslateY(getTranslateY()+ step);
    }

    public void goRight() {
        setTranslateX(getTranslateX()+ step);
    }

    public void goLeft() {
        setTranslateX(getTranslateX()- step);
    }


    @Override
    public void run() {
        draw();
    }
}
