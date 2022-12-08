package com.example.iafinal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;


import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import static com.example.iafinal.Data.teams;

public class PlayerController {

    @FXML
    private ComboBox teamsDropDown;

    @FXML
    private TextField txtName;
    //this is for the player class
    @FXML
    private TextField txtNumber;
    //this is for the player class
    @FXML
    private TextField txtPosition;


    @FXML
    private TableView TeamTableView;

    @FXML
    private TableColumn <Player, String> nameTV;

    @FXML
    private TableColumn <Player, String> positionTV;

    @FXML
    private TableColumn <Player, String> numberTV;

    @FXML
    //private TableColumn <Player, Integer> playerIDTV;

    private Stage stage;
    private Scene scene;


    Integer playerID = -1;
    public void initialize(){
        // this method adds the team names to the menuButton dropdown
        for (int i = 0; i < teams.size(); i++){
            teamsDropDown.getItems().add(teams.get(i).getTeamName());
        }



        //this is the setting up of columns in the table view
        nameTV.setCellValueFactory(new PropertyValueFactory<Player, String>("name"));
        positionTV.setCellValueFactory(new PropertyValueFactory<Player, String>("position"));
        numberTV.setCellValueFactory(new PropertyValueFactory<Player, String>("number"));
        //playerIDTV.setCellValueFactory(new PropertyValueFactory<Player, Integer>(playerID.toString()));


        //Creating an observable list of players
        ObservableList<Player> players = FXCollections.observableArrayList(teams.get(0).getSquad());

        TeamTableView.setItems(players);
    }



    //array list of IDs
    ArrayList<Integer> IDArray = new ArrayList<>();

    //array of arrays of each player's statistics
    int[][] statisticsTest = new int[1000][];

    public void AddPlayer(ActionEvent actionEvent){

        playerID++;
        //Creating a new player object with the users inputs
        Player player = new Player(playerID, txtName.getText(), txtPosition.getText(),txtNumber.getText());
        System.out.println(player.getPlayerID());
        System.out.println(player.getName());
        System.out.println(player.getNumber());


        System.out.println(player.getPosition());
        //adds the statistics?
        statisticsTest[playerID] = new int[] {Statistics.getTrueService(),Statistics.getFalseService() };
        System.out.println(Arrays.toString(statisticsTest[0]));

        //clearing the text fields
        txtName.clear();
        txtPosition.clear();
        txtNumber.clear();

        //this for loop allows the user to add the players to their chosen team
        for(int i = 0; i < teams.size(); i++) {
            //making the dropdown menu to have the team names
            String teamName = teams.get(i).getTeamName();
            String selected = teamsDropDown.getSelectionModel().getSelectedItem().toString();

            if(teamName.equals(selected)){
                //adds the player to the team selected
                teams.get(i).addPlayer(player);
                System.out.println("Player added");
                ObservableList<Player> players = FXCollections.observableArrayList(teams.get(i).getSquad());
                //adds the name, position, number and ID of the player in the table view
                TeamTableView.setItems(players);
                System.out.println(players);
                //saves the team using the saveTeam method in Data
                Data.saveTeams();
                System.out.println(players);

            }
        }

    }

    @FXML
    public void SwitchToHomePage (ActionEvent event) throws IOException {
        //this method switches from scene createTeam to TableView
        Parent parent = FXMLLoader.load(getClass().getResource("createMatch.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public void SwitchToMatch (ActionEvent event) throws IOException {
        //this method switches from scene createTeam to TableView
        Parent parent = FXMLLoader.load(getClass().getResource("homePage2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }


}
