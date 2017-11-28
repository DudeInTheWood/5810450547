package models;

import javafx.scene.canvas.GraphicsContext;

public class Misc extends DrawObject implements Drawable{
    public GraphicsContext gc = getGraphicsContext2D();
    public Misc(int x,int y){
        super(x, y);
    }

    @Override
    public void draw() {
    }
}
