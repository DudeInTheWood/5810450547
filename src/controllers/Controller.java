package controllers;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import models.*;

import java.io.IOException;
import java.lang.Character;
import java.util.Random;

public class Controller {
    @FXML
    private Pane pane;
    private Thread thread1, thread2, thread3;

    protected Beach beachArea;
    protected CoconutTree coco1, coco2;
    protected Van van;
    protected Player character1;


    @FXML
    public void ShowInfoBtn(ActionEvent event) throws IOException{
//        System.out.println("It's work.");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/gui/InfoView.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setTitle("info");
        stage.setScene(new Scene(root, 600, 400));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    public void initialize(){
        beachArea = new Beach(0,0);
        character1 = new Player(500,300);
        van = new Van(-300,100);
        character1 = new Player(500,300);
        thread1 = new Thread(van);
        thread2 = new Thread(beachArea);
        thread3 = new Thread(character1);
        display();
        pane.getParent().setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()){
                    case W:
                        character1.goUp();
                        System.out.println("w");break;
                    case S:
                        character1.goDown();
                        System.out.println("s");break;
                    case A:
                        character1.goLeft();
                        System.out.println("a");break;
                    case D:
                        character1.goRight();
                        System.out.println("d");break;

                }
            }
        });


    }

    public void display() {
        pane.getChildren().clear();
        pane.getChildren().addAll(beachArea, character1, van);
        van.vanTransition();
        thread1.start();
        thread2.start();
        thread3.start();
    }

    @FXML
    public void randomBodyColor(){
        System.out.println("kuy");
        Random rand = new Random();
        int r = rand.nextInt(255)+0;
        int g = rand.nextInt(255)+0;
        int b = rand.nextInt(255)+0;
        character1.setBodyColor(Color.rgb(r,g,b));
        character1.draw();
    }

}