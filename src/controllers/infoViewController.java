package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;
import models.Player;

import java.util.Optional;

public class infoViewController {
    @FXML
    private AnchorPane pane;
    protected Player player;

    public void initialize(){
        player = new Player(60,30);
        player.draw();
        display();

    }
    public void display(){
        pane.getChildren().addAll(player);
    }

    public void closeBtn(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Do you want to close ? " , ButtonType.OK, ButtonType.CANCEL);
        Optional optional = alert.showAndWait();
        if (optional.get() == ButtonType.OK) {
            Alert alert2 = new Alert(Alert.AlertType.CONFIRMATION, "Are your sure !?" , ButtonType.OK, ButtonType.CANCEL);
            Optional optional2 = alert2.showAndWait();
            if (optional2.get() == ButtonType.OK) {
                Alert alert3 = new Alert(Alert.AlertType.CONFIRMATION, "Why Don't you press the top-right button to close it ?" ,ButtonType.CANCEL);
                Optional optional3 = alert3.showAndWait();
                if (optional3.get() == ButtonType.CANCEL){

                }
            }
        }
        }

}
