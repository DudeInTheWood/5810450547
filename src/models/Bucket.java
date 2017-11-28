package models;

import javafx.scene.paint.Color;

public class Bucket extends Misc {
    private Color bucketColor = Color.rgb(255, 100, 24);

    public Bucket(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        gc.setFill(bucketColor);
        gc.strokeLine(465,310, 465,325);
        gc.fillRect(440,320,25,22);
        gc.fillRect(440,305,25,5);
        gc.strokeLine(440,310, 440,325);
        gc.setFill(Color.rgb(207, 179, 128));
        gc.fillOval(450,335,25,10);
        gc.fillOval(430,335,25,10);
    }
}
