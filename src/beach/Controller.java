package beach;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import models.*;

public class Controller {
    @FXML
    private Pane pane;
    protected Beach beachArea;
    protected Cloud cloud1,cloud2,cloud3,cloud4;
    protected CoconutTree coco1, coco2;
    protected Misc lifeRing,skull,bucket;
    protected Van van;

    @FXML
    public void initialize(){
        beachArea = new Beach(0,0);
        //boat = new BoatShip(200,0);
        cloud1 = new Cloud();
        cloud2 = new Cloud();
        cloud3 = new Cloud();
        cloud4 = new Cloud();
        coco1 = new CoconutTree(30,40);
        coco2 = new CoconutTree(-50,40);
        lifeRing = new Misc(-60,40);
        skull = new Misc(520,350);
        bucket = new Misc(-70,45);
        van = new Van(-500,0);
        display();
        this.vanTransition();
    }

    public void display() {
        //boat.draw();
        pane.getChildren().clear();
        beachArea.draw();
        cloud1.drawCould1(10,40);
        cloud2.drawCloud2(190,60);
        cloud3.drawCould1(320,10);
        cloud4.drawCloud2(470,55);
        coco1.draw();
        coco2.draw();
        lifeRing.drawLifeRing();
        skull.drawSkull();
        bucket.drawBucket();
        van.draw();
        pane.getChildren().addAll(beachArea, cloud1, cloud2, cloud3, cloud4, coco1, coco2, lifeRing, skull, bucket, van);
    }

    public void vanTransition() {
        int xPoint = 0;
        TranslateTransition tTran = new TranslateTransition(Duration.seconds(3) , van);
        tTran.setFromX(van.getTranslateX());
        tTran.setToX(van.getTranslateX() + 1200);
        tTran.setCycleCount(Animation.INDEFINITE);
        tTran.play();


    }
}