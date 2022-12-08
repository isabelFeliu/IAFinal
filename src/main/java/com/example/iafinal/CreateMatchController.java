package com.example.iafinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.iafinal.Data.teams;

public class CreateMatchController {

    @FXML
    private ComboBox teamsDropDown;

    @FXML
    private TextField guestName;

    private Stage stage;
    private Scene scene;

    @FXML
    private Button MatchPage;


    Match match = new Match();

    public void initialize() {
        // this method adds the teams to the menuButton
        for (int i = 0; i < teams.size(); i++) {
            teamsDropDown.getItems().add(teams.get(i).getTeamName());

        }
    }

    public void SelectTeam(ActionEvent actionEvent) {
        for (int i = 0; i < teams.size(); i++) {
            String teamName = teams.get(i).getTeamName();
            String selected = teamsDropDown.getSelectionModel().getSelectedItem().toString();
            if (teamName.equals(selected)) {
                teams.get(i).addMatch(match);
                System.out.println(match.getTeam());
                System.out.println(teams.get(i).getSquad());
                // Need to add stats object to every player in squad

            }
        }

    }

    public void saveCreateTeam(ActionEvent actionEvent){
        match.setGuestTeam(guestName.getText());
    }

    public void MatchPage(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("matchPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }




}
