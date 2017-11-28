package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CoconutTree extends Canvas {
    private GraphicsContext gc = getGraphicsContext2D();

    public CoconutTree(int x,int y) {
        setTranslateX(x);
        setTranslateY(y);

        setWidth(600);
        setHeight(400);
    }

    public void draw(){
        leave();
        trunk();
    }

    public void trunk () {
        gc.setFill(Color.rgb(197, 164, 102));
        gc.fillRect(480,240,20,100);
        gc.setFill(Color.rgb(60,40,40));
        gc.fillOval(487,225,30,30);
        gc.setFill(Color.rgb(60,40,40));
        gc.fillOval(465,225,30,30);
    }

    public void leave() {
        gc.setFill(Color.rgb(84, 154, 20));
        gc.fillOval(495,180,40,80);
        gc.fillOval(470,180,40,80);
        gc.fillOval(445,180,40,80);
//        gc.setFill(Color.rgb(103, 178, 21));
//        gc.fillOval(510,200,10,20);
//        gc.fillOval(485,200,10,20);
//        gc.fillOval(460,200,10,20);
    }
}
