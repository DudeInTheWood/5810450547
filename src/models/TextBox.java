package models;

import javafx.animation.FadeTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class TextBox extends Misc implements Runnable {
    private String text;

    public TextBox(int x, int y) {
        super(x, y);
        setHeight(80);
        setWidth(750);
        text = "";
        baseColor = Color.rgb(23, 232, 255, 0.2392);
        textColor = Color.grayRgb(0);
    }

    @Override
    public void draw() {
        drawBox();
    }

    @Override
    public void run() {
        draw();
    }
    public void setText(String text){
        this.text = text;
        gc.setFont(new Font("Bodoni MT Bold Italic",22));
    }

    public void drawBox(){
        gc.setFill(baseColor);
        gc.fillRect(10,0,750,50);
        gc.setFill(textColor);
        gc.fillText(this.text,25,30,700);
    }

    public void textBoxTransition() {
        FadeTransition fade = new FadeTransition(Duration.seconds(5),this);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
    }
}
