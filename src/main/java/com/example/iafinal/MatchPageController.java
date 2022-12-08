package com.example.iafinal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.iafinal.Data.teams;

public class MatchPageController {
    @FXML
    private TableView teamTableView;
    @FXML
    private TableColumn<Player, String> nameTV;

    @FXML
    private TableColumn <Player, String> positionTV;

    @FXML
    private TableColumn <Player, String> numberTV;

    @FXML

    private Stage stage;
    private Scene scene;

    public void initialize(){
        //this method initializes the table view. The table view contains the players inside the chosen team
        nameTV.setCellValueFactory(new PropertyValueFactory<Player, String>("name"));
        positionTV.setCellValueFactory(new PropertyValueFactory<Player, String>("position"));
        numberTV.setCellValueFactory(new PropertyValueFactory<Player, String>("number"));

        ObservableList<Player> players = FXCollections.observableArrayList(teams.get(0).getSquad());
        teamTableView.setItems(players);
    }

    ObservableList<Player> playerList;

    public void accuracyPage(MouseEvent event) throws IOException {
        //This method switches scenes from MatchPage to accuracyPage
        playerList = teamTableView.getSelectionModel().getSelectedItems();
        System.out.println(playerList);
        Parent parent = FXMLLoader.load(getClass().getResource("accuacyPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCreateTeam(ActionEvent event)throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("createTeam.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
