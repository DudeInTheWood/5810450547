package controllers;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import models.*;

public class Controller {
    @FXML
    private Pane pane;
    @FXML
    private Button showInfoBtn;
    private Thread thread1, thread2, thread3;

    protected Beach beachArea;
    protected CoconutTree coco1, coco2;
    protected Misc lifeRing,skull,bucket;
    protected Van van;


    @FXML
    public void ShowInfoBtn(){
        System.out.println("It's work.");
    }

    @FXML
    public void initialize(){
        beachArea = new Beach(0,0);
//        //boat = new BoatShip(200,0);
//        cloud1 = new Cloud();
//        cloud2 = new Cloud();
//        cloud3 = new Cloud();
//        cloud4 = new Cloud();
//        coco1 = new CoconutTree(30,40);
//        coco2 = new CoconutTree(-50,40);
//        lifeRing = new Misc(-60,40);
//        skull = new Misc(520,350);
//        bucket = new Misc(-70,45);
        van = new Van(-600,150);
        thread1 = new Thread(van);
        thread2 = new Thread(beachArea);
        display();
    }

    public void display() {
        pane.getChildren().clear();
        beachArea.draw();
        van.draw();
        pane.getChildren().addAll(beachArea, van);
        thread2.start();
        thread1.start();
    }

}