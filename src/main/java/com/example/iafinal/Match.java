package com.example.iafinal;

import java.io.Serializable;

public class Match implements Serializable {
    private String guestTeam;
    private Team team;
    private int ourPoints;
    private int guestsPoints;

    private int id;

    public Match(String guestTeam, int ourPoints, int guestsPoints, Team team) {
        this.guestTeam = guestTeam;
        this.ourPoints = ourPoints;
        this.guestsPoints = guestsPoints;
    }

    public Match(){

    }

    public String getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(String guestTeam) {
        this.guestTeam = guestTeam;
    }

    public int getOurPoints() {
        return ourPoints;
    }

    public void setOurPoints(int ourPoints) {
        this.ourPoints = ourPoints;
    }

    public int getGuestsPoints() {
        return guestsPoints;
    }

    public void setGuestsPoints(int guestsPoints) {
        this.guestsPoints = guestsPoints;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}
