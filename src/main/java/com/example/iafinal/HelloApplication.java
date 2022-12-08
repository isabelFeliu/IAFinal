package com.example.iafinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    //This method starts the application and shows the home page of the application
    public void start(Stage stage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("homePage2.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Home Page");
        stage.show();

    }

    //This method launches the saves Data and the application
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Data.loadTeams();
        launch();
    }
}