package models;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.util.Random;

public class Cloud extends DrawObject implements Runnable {

    private Random rand = new Random();

    public Cloud(int x, int y){
        super(x,y);
    }

    @Override
    public void draw(){
       int n = rand.nextInt(2)+1;
       if (n == 1){
           drawCloud1();
       }else{
           drawCloud2();
       }
    }

    public void drawCloud1(){
        gc.setFill(Color.rgb(255, 231, 191));
        gc.fillRect(20,35,30,30);
        gc.fillRect(40,45,30,30);
        gc.fillRect(45,20,30,30);
        gc.fillRect(70,32,30,30);
        gc.fillRect(80,43,30,30);
    }

    public void drawCloud2(){
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

    @Override
    public void run() {
        draw();
    }

    public void cloudTransition() {
        int n = new Random().nextInt(300)+(-150);
        TranslateTransition tTran = new TranslateTransition(Duration.seconds(20) , this);
        FadeTransition ft = new FadeTransition(Duration.seconds(10) , this);
        tTran.setFromX(this.getTranslateX());
        tTran.setToX(this.getTranslateX() + n);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        tTran.setAutoReverse(true);
        ft.setAutoReverse(true);
        tTran.setCycleCount(Animation.INDEFINITE);
        ft.setCycleCount(Animation.INDEFINITE);
        tTran.play();
        ft.play();
    }
}
