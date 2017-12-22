package models;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.awt.*;

public class Ship extends Vehicle implements Runnable{
    private GraphicsContext gc = getGraphicsContext2D();
    private Color sailColor;

    public Ship(int x, int y) {
        super(x, y);

        bodyColor = Color.rgb(0,0,0);
        sailColor = Color.rgb(0,0,0);
    }

    public void setBodyColor(Color color){
        this.bodyColor = color;
    }
    public void setSailColor(Color color){
        this.sailColor = color;
    }

    @Override
    public void run() {
        draw();
    }

    @Override
    public void draw() {
        drawBody();
        sail();
    }


    @Override
    public void vehicleTransition(){
        sizeTransition();
        moveTransition();
        fade();
    }

    public void fade(){
        FadeTransition ft = new FadeTransition(Duration.seconds(25),this);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.setAutoReverse(true);
        ft.setCycleCount(Animation.INDEFINITE);
        ft.play();
    }
    public void moveTransition() {
        TranslateTransition tTran = new TranslateTransition(Duration.seconds(50) , this);
        tTran.setFromX(this.getTranslateX());
        tTran.setToX(this.getTranslateX() + (-800));
        tTran.setCycleCount(Animation.INDEFINITE);
        tTran.play();
    }

    public void sizeTransition(){
        ScaleTransition st = new ScaleTransition(
                Duration.seconds(25), this
        );
        st.setFromX(0);
        st.setFromY(0);
        st.setToX(0.5);
        st.setToY(0.5);
        st.setCycleCount(2);
        st.setAutoReverse(true);
        st.play();
    }

    public void drawBody(){
        gc.setFill(this.bodyColor);
        gc.fillRect(50,70,60,20);
        gc.fillRect(40,60,30,20);
        gc.fillRect(30,55,30,10);
        gc.fillRect(25,55,30,5);
        gc.fillRect(95,65,30,20);
        gc.fillRect(95,65,30,20);
        gc.fillRect(100,60,30,20);
        gc.fillRect(112,55,20,20);
        gc.fillRect(80,30,6,60);
    }

    public void sail() {
        gc.setFill(this.sailColor);
        gc.fillRect(70,35,30,30);
    }
}
