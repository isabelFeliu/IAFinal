package com.example.iafinal;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.iafinal.Data.teams;

public class TeamController {

    @FXML private TextField txtTeamName;
    private Stage stage;
    private Scene scene;



    public void AddTeam(ActionEvent actionEvent){
        //This method is creating a new team and allowing the user to give it a name
        Team newTeam = new Team(txtTeamName.getText());
        teams.add(newTeam);
        //saving the name of the team using the method saveTeams on Data
        Data.saveTeams();
        txtTeamName.clear();
    }


    public void SwitchToSceneCreateTeam (ActionEvent event) throws IOException {
        //this method switches from scene addTeam to createTeam
        Parent parent = FXMLLoader.load(getClass().getResource("createTeam.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
