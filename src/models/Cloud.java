package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Cloud extends Canvas {
    private GraphicsContext gc = getGraphicsContext2D();
    public Cloud(){
        setWidth(200);
        setHeight(200);
    }

    public void drawCould1(int x,int y){
        setTranslateX(x);
        setTranslateY(y);
        gc.setFill(Color.rgb(255, 231, 191));
        gc.fillRect(20,35,30,30);
        gc.fillRect(40,45,30,30);
        gc.fillRect(45,20,30,30);
        gc.fillRect(70,32,30,30);
        gc.fillRect(80,43,30,30);
    }

    public void drawCloud2(int x,int y){
        setTranslateX(x);
        setTranslateY(y);
        gc.setFill(Color.rgb(255, 231, 191));
        gc.fillRect(20,35,30,30);
        gc.fillRect(40,45,30,30);
        gc.fillRect(45,20,30,30);
        gc.fillRect(70,32,30,30);
        gc.fillRect(80,43,30,30);
        gc.fillRect(110,70,20,10);
        gc.fillRect(145,50,10,10);
        gc.fillRect(130,60,10,7);
        gc.fillRect(140,70,5,5);
        gc.fillRect(100,60,25,25);
    }
}
