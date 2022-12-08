package com.example.iafinal;

import javafx.beans.property.SimpleStringProperty;

import java.io.*;
import java.util.ArrayList;


public class Team implements Serializable {
    // This class allows the user to create a team with a team name and a squad, which are the players within the team
    private String teamName = "";
    //this array lists allows the user to add players into a specific team
    private ArrayList<Player> squad = new ArrayList<>();
    private ArrayList<Match> matches = new ArrayList<>();

    public void addMatch(Match match) {
        this.matches.add(match);
    }

    public Team(String teamName) {

        this.teamName = teamName;
    }

    //getters and setters for the teams

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList<Player> getSquad() {
        return squad;
    }

    public void setSquad(ArrayList<Player> squad) {
        this.squad = squad;
    }

    public void addPlayer(Player player){
        squad.add(player);
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }




}
