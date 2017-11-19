package beach;

import javafx.scene.canvas.Canvas;

public class Ship extends Canvas{

    public Ship(int x, int y) {
        setTranslateX(x);
        setTranslateX(y);

        setHeight(600);
        setWidth(600);
    }
}
