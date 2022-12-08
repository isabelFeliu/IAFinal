package com.example.iafinal;
import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {
    //Player class allows the user to create player objects that have a name, position and number

    private Integer playerID;
    private String name;
    private String position;
    private String  number;

    //each player has a statistic
    private ArrayList<Statistics> statistics = new ArrayList<>();


    public Player(Integer playerID, String name, String number, String position) {
        //constructor
        this.playerID = playerID;
        this.name = name;
        this.position = position;
        this.number = number;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }


}

