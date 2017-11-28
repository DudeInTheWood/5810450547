package controllers;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import models.*;

import java.io.IOException;
import java.util.Random;

public class Controller {
    @FXML
    private Pane pane;
    private Thread thread1, thread2, thread3;

    protected Beach beachArea;
    protected CoconutTree coco1, coco2;
    protected Van van;
    protected Player player;
    protected SkullIsland skull;


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
        player = new Player(500,300);
        van = new Van(-300,100);
        skull = new SkullIsland(20,185);
        player = new Player(500,300);
        thread1 = new Thread(van);
        thread2 = new Thread(beachArea);
        thread3 = new Thread(player);
        display();
        pane.getParent().setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()){
                    case W:
                        player.goUp();
                        System.out.println("w");break;
                    case S:
                        player.goDown();
                        System.out.println("s");break;
                    case A:
                        player.goLeft();
                        System.out.println("a");break;
                    case D:
                        player.goRight();
                        System.out.println("d");break;
                    case ENTER:
                        System.out.println("Found island");
                        showSkullIsland();
                }
            }
        });


    }

    public void display() {
        pane.getChildren().clear();
        pane.getChildren().addAll(beachArea, player, van, skull);
        van.vanTransition();
        thread1.start();
        thread2.start();
        thread3.start();
    }

    @FXML
    public void randomBodyColor(){
        Random rand = new Random();
        int r = rand.nextInt(255)+0;
        int g = rand.nextInt(255)+0;
        int b = rand.nextInt(255)+0;
        player.setBodyColor(Color.rgb(r,g,b));
        player.draw();
    }

    @FXML
    public void showSkullIsland(){
        skull.draw();
        FadeTransition fade = new FadeTransition(Duration.seconds(5),skull);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
    }

}