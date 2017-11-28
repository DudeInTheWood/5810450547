package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Misc extends Canvas {
    private GraphicsContext gc = getGraphicsContext2D();
    public Misc(int x,int y){
        setTranslateX(x);
        setTranslateY(y);

        setHeight(400);
        setWidth(600);
    }

    public void drawLifeRing(){
        gc.setFill(Color.rgb(255, 247, 216));
        gc.fillRect(480,300,20,10);
        gc.fillRect(480,330,20,10);
        gc.fillRect(465,310,10,20);
        gc.fillRect(505,310,10,20);
        gc.setFill(Color.rgb(218, 17, 1));
        gc.fillRect(470,305,10,10);
        gc.fillRect(500,305,10,10);
        gc.fillRect(500,325,10,10);
        gc.fillRect(470,325,10,10);
    }

    public void drawSkull(){
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

    public void drawBucket() {
        gc.setFill(Color.rgb(255, 100, 24));
        gc.strokeLine(465,310, 465,325);
        gc.fillRect(440,320,25,22);
        gc.fillRect(440,305,25,5);
        gc.strokeLine(440,310, 440,325);
        gc.setFill(Color.rgb(207, 179, 128));
        gc.fillOval(450,335,25,10);
        gc.fillOval(430,335,25,10);
    }
}
