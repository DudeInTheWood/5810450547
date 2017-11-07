package beach;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Van extends Canvas {
    private GraphicsContext gc = getGraphicsContext2D();

    public Van (int x, int y){
        setTranslateX(x);
        setTranslateY(y);

        setHeight(400);
        setWidth(600);
    }

    public void draw(){
        drawBody();
    }

    public void drawBody() {
        //upper body
        gc.setFill(Color.rgb(230, 227, 213));
        gc.fillRect(30,300,190,45);
        gc.fillRect(40,290,170,40);
        //lower body
        gc.setFill(Color.rgb(202, 51, 31));
        gc.fillRect(30,330,190,40);
        gc.fillRect(40,330,170,50);
        //misc
        gc.setFill(Color.GRAY);
        gc.fillRect(220,320,10,40);
        gc.fillRect(60,280,120,10);
        gc.setFill(Color.rgb(236, 212, 0));
        gc.fillRect(190,350,10,5);
        gc.fillRect(210,350,10,10);
        //mirror
        gc.setFill(Color.rgb(0, 149, 102));
        gc.fillRect(190,300,30,25);
        gc.fillRect(190,295,20,30);
        gc.fillRect(150,300,30,25);
        gc.fillRect(110,300,30,25);
        gc.fillRect(60,300,50,25);
        gc.fillRect(30,300,15,25);
        //wheels
        gc.setFill(Color.rgb(51, 14, 1));
        gc.fillOval(50,350,40,40);
        gc.fillOval(160,350,40,40);
        gc.setFill(Color.grayRgb(63));
        gc.fillOval(55.5,355.5,25,25);
        gc.fillOval(170,355,25,25);
    }
}
