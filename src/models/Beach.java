package models;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Beach extends Drawable implements Runnable {
    private GraphicsContext gc = getGraphicsContext2D();
    private Cloud cloud1;
    private Random rand = new Random();

    public Beach(int x,int y){
        super(x,y);
        cloud1 = new Cloud(50,50);
    }

    @Override
    public void draw() {
        this.drawSky();
        this.drawSand();
        this.drawSea();
    }

    public void drawSand() {
        gc.setFill(Color.rgb(227 , 194, 152));
        gc.fillRect(0,300,900,200);
        gc.setFill(Color.rgb(198, 156, 106));
        gc.fillRect(0,300,900,50);
        gc.setFill(Color.rgb(147 , 115 , 75));
        gc.fillRect(0,300,900,10);
        gc.setFill(Color.grayRgb(169));
        gc.fillRect(0,480,900,50);
    }

    public void drawSky() {
        gc.setFill(Color.rgb(243, 119 , 119 ));
        gc.fillRect(0,0,900,300);
        gc.setFill(Color.rgb(251 , 174 , 92));
        gc.fillOval(300,120,700,250);
        gc.setFill(Color.rgb(255, 231, 0));
        gc.fillOval(550,180,150,120);
        cloud1.draw();
    }

    public void drawSea() {
        gc.setFill(Color.rgb(0 , 84, 170));
        gc.fillRect(0,220,900,80);
        gc.setFill(Color.rgb(47 , 128, 209));
        gc.fillRect(0,230,900,25);
        gc.setFill(Color.rgb(249 , 241, 234));
        gc.fillRect(0,295,900,7);
        gc.setFill(Color.rgb(154 , 193, 230));
        gc.fillRect(0,290,900,7);
        gc.setFill(Color.rgb(154 , 193, 230));
        gc.fillRect(0,215,900,7);
        int realX = 0;
        for (int i = 0; i < 20;i++){
            int x = rand.nextInt(30) + 20;
            int y = rand.nextInt(60) + 230;
            gc.fillRect(realX+=x,y,5,5);
//            System.out.println("x: "+realX);
//            System.out.println("y: "+y+"\n");
        }
    }

    @Override
    public void run() {
        draw();
    }
}
