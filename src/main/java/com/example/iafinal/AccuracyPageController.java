package com.example.iafinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class AccuracyPageController {

    private Stage stage;
    private Scene scene;
    @FXML
    private Button SER_T;
    @FXML
    private Button SER_F;
    @FXML
    private Button SP_T;
    @FXML
    private Button SP_F;
    @FXML
    private Button SET_T;
    @FXML
    private Button SET_F;
    @FXML
    private Button RE_T;
    @FXML
    private Button RE_F;
    @FXML
    private Button BL_T;
    @FXML
    private Button BL_F;

    Statistics statistics = new Statistics();

    public void SER_add(ActionEvent event) throws IOException {
        //this method adds to the corrisponding counter 
        System.out.println("hello 1");
        statistics.trueServiceAdd();
        System.out.println();
        Parent parent = FXMLLoader.load(getClass().getResource("matchPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void SER_subtract(ActionEvent event) throws IOException{
        statistics.falseServiceAdd();
        Parent parent = FXMLLoader.load(getClass().getResource("matchPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void SP_add(ActionEvent event) throws  IOException{
        statistics.tureSpikeAdd();
        Parent parent = FXMLLoader.load(getClass().getResource("matchPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void SP_subtract(ActionEvent event) throws IOException{
        statistics.falseSpikeAdd();
        Parent parent = FXMLLoader.load(getClass().getResource("matchPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void SET_add(ActionEvent event) throws IOException{
        statistics.trueSetAdd();
        Parent parent = FXMLLoader.load(getClass().getResource("matchPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void SET_subtract(ActionEvent event) throws IOException{
        statistics.falseSetAdd();
        Parent parent = FXMLLoader.load(getClass().getResource("matchPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void RE_add(ActionEvent event) throws IOException{
        statistics.trueReceivingAdd();
        Parent parent = FXMLLoader.load(getClass().getResource("matchPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void RE_subtract(ActionEvent event) throws IOException{
        statistics.falseReceivingAdd();
        Parent parent = FXMLLoader.load(getClass().getResource("matchPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void BL_add(ActionEvent event) throws IOException{
        statistics.trueBlockAdd();
        Parent parent = FXMLLoader.load(getClass().getResource("matchPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void BL_subtract(ActionEvent event) throws IOException{
        statistics.falseBlockAdd();
        Parent parent = FXMLLoader.load(getClass().getResource("matchPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }






}
