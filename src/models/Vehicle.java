package models;

import javafx.scene.paint.Color;

public abstract class Vehicle extends DrawObject {
    protected Color bodyColor;
    public Vehicle(int x, int y) {
        super(x, y);

        setHeight(200);
        setWidth(200);
    }

    public void vehicleTransition(){}
}
