package com.example.iafinal;
import javafx.collections.FXCollections;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class homePageController {
    private Stage stage;
    private Scene scene;

    public void switchSceneToAddTeam (ActionEvent event) throws IOException {
        //This method switches from scene homePage to addTeam
        Parent parent = FXMLLoader.load(getClass().getResource("addTeam.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Create Team");
        stage.show();
    }

    @FXML
    public void goToAddPlayer (ActionEvent event) throws IOException {
        //This method switches from scene homePage to createTeam
        System.out.println("working");
        Parent parent = FXMLLoader.load(getClass().getResource("createTeam.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("");
        stage.show();
    }

    @FXML
    public void goToMatch (ActionEvent event) throws IOException {
        //This method switches from scene homePage to match
        System.out.println("working");
        Parent parent = FXMLLoader.load(getClass().getResource("createMatch.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }


}
