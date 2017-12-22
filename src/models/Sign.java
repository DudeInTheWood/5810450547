package models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Sign extends Misc implements Runnable{
    private Color ropeColor;

    public Sign(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        drawSign();
    }

    public void drawSign(){
        gc.setFill(Color.rgb(143, 45, 1));
        gc.fillRect(0,10,50,30);
        gc.strokeLine(25,0,0,10);
        gc.strokeLine(25,0,50,10);
        gc.setFill(Color.rgb(226, 220, 224));
        gc.setFont(new Font("Bodoni MT Bold Italic",13));
        gc.fillText("HERE !",1,30,500);

    }

    @Override
    public void run() {
        draw();
    }
}
