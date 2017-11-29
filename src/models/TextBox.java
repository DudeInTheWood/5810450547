package models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class TextBox extends DrawObject implements Runnable,Drawable {
    private GraphicsContext gc = getGraphicsContext2D();
    private String text;

    public TextBox(int x, int y) {
        super(x, y);
        setHeight(80);
        setWidth(750);
        text = "";
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
    }

    public void drawBox(){
        gc.setFill(Color.rgb(255, 60, 173));
        gc.fillRect(10,0,750,50);
    }
}
