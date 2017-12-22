package models;

import javafx.scene.paint.Color;

public abstract class Misc extends DrawObject {
    protected Color baseColor;
    protected Color textColor;

    public Misc(int x, int y) {
        super(x, y);

        setHeight(200);
        setWidth(300);
    }
}
