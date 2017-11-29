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
import java.util.ArrayList;
import java.util.Random;

public class Controller {
    @FXML
    private Pane pane;
    private Thread thread1, thread2, thread3, thread4, thread5, thread6, thread7, thread8, thread9;
    private ArrayList<Interactable> interactable;
    private ArrayList<Vehicle> vehicles;

    protected Beach beachArea;
    protected CoconutTree coco1, coco2;
    protected Van van;
    protected Player player;
    protected SkullIsland skull;
    protected LifeRing lifeRing;
    protected Bucket bucket;
    protected Sign sign;
    protected TextBox textBox;
    protected Cloud cloud1, cloud2, cloud3, cloud4, cloud5;
    protected Box box1, box2;
    protected Ship ship;



    @FXML
    public void ShowInfoBtn(ActionEvent event) throws IOException{
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
    public void initialize() throws InterruptedException {
        interactable = new ArrayList<>();
        vehicles = new ArrayList<>();
        beachArea = new Beach(0,0);
        player = new Player(500,300);
        van = new Van(-300,100);
        skull = new SkullIsland(20,185);
        player = new Player(500,300);
        coco1 = new CoconutTree(180,60);
        coco2 = new CoconutTree(240,60);
        bucket = new Bucket(200,300);
        lifeRing = new LifeRing(300,300);
        sign = new Sign(700,330);
        textBox = new TextBox(25,5);
        cloud1 = new Cloud(50,50);
        cloud2 = new Cloud(650, 75);
        cloud3 = new Cloud(370, 30);
        cloud4 = new Cloud(240, 25);
        cloud5 = new Cloud(475, 40);
        ship = new Ship(600,119);
        box1 = new Box(610,300);
        box2 = new Box(630,302);

        thread1 = new Thread(van);
        thread2 = new Thread(cloud4);
        thread3 = new Thread(player);
        thread4 = new Thread(coco1);
        thread5 = new Thread(coco2);
        thread6 = new Thread(lifeRing);
        thread7 = new Thread(bucket);
        thread8 = new Thread(sign);
        thread9 = new Thread(ship);
        interactable.add(bucket);
        vehicles.add(van);
        vehicles.add(ship);

        display();
        pane.getParent().setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()){
                    case W:
                        if(player.getTranslateY() > 220){
                            player.goUp();
                            System.out.println(player.getTranslateX());
                            System.out.println(player.getTranslateY());
                            System.out.println("w");
                        }
                        ;break;
                    case S:
                        if(player.getTranslateY() <360){
                            player.goDown();
                            System.out.println(player.getTranslateX());
                            System.out.println(player.getTranslateY());
                            System.out.println("s");
                        }break;
                    case A:
                        if (player.getTranslateX() < -30){
                            player.setTranslateX(900);
                        }
                        player.goLeft();
                        System.out.println(player.getTranslateX());
                        System.out.println(player.getTranslateY());
                        System.out.println("a");break;
                    case D:
                        if (player.getTranslateX() > 900){
                            player.setTranslateX(-30);
                        }
                        player.goRight();
                        System.out.println(player.getTranslateX());
                        System.out.println(player.getTranslateY());
                        System.out.println("d");break;
                    case ENTER:
                        for (Interactable i : interactable){
                            String[] locat = i.locationOfItem().split(" ");
                            double xItem = Double.parseDouble(locat[0]);
                            double yItem = Double.parseDouble(locat[1]);
                            System.out.println(xItem);
                            System.out.println(yItem);
                            if ((player.getTranslateX()+30)<=(xItem+10) && (player.getTranslateX()+30)>=(xItem-10)
                                    && (player.getTranslateY()+30)<=(yItem+10) && (player.getTranslateY()+30)>=(yItem-10)){
                                i.response();
                                break;
                            }
                        }
                        if (player.getTranslateX()<= 700 && player.getTranslateX()>=645 && player.getTranslateY() <= 320 && player.getTranslateY() >= 300){
                            showSkullIsland();
                        }
                }
            }
        });


    }

    public void display() throws InterruptedException {
        pane.getChildren().clear();
        beachArea.draw();
        cloud1.draw();
        cloud2.draw();
        cloud3.draw();
        cloud4.draw();
        cloud5.draw();
        box1.draw();
        box2.draw();
        cloud4.cloudTransition();
        cloud5.cloudTransition();
        for (Vehicle v : vehicles){
            v.vehicleTransition();
        }
        pane.getChildren().addAll(beachArea, cloud1, cloud2, cloud3, cloud4
                , cloud5, lifeRing, bucket, player,coco1, coco2, box1, box2, sign, van, skull ,textBox, ship);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
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
    public void showSkullIsland() {
        skull.draw();
        FadeTransition fade = new FadeTransition(Duration.seconds(5),skull);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
        showTextBox();
    }

    public void showTextBox() {
        textBox.setText("Oh.. i got a map that lead to skull island behind the box, but i can't reach it....let's forget about it...");
        textBox.draw();
        textBox.textBoxTransition();
    }

}