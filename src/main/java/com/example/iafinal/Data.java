package com.example.iafinal;

import java.io.*;
import java.util.ArrayList;

public class Data {

    private static int teamSelected = -1;
    public static ArrayList<Team> teams = new ArrayList<>();

    public static ArrayList<Team> squad = new ArrayList<>();

    public static int getTeamSelected() {
        return teamSelected;
    }

    public static void setTeamSelected(int teamSelected) {
        Data.teamSelected = teamSelected;
    }

    public static ArrayList<Team> getTeams() {
        return teams;
    }

    public static void setTeams(ArrayList<Team> teams) {
        Data.teams = teams;
    }

    public static void addTeam(Team team) {
        Data.teams.add(team);
    }

    public static void removeTeam(Team team){
        Data.teams.remove(team);
    }
    public static void saveTeams(){
        //this method saves data that the users inputs when called
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("teams_save.txt");
            ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(teams);
            objectOutputStream.flush();
            objectOutputStream.close();
        }
         catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void loadTeams(){
        //this method loads the teams already saved using the method above
        try {
            FileInputStream fileInputStream
                    = new FileInputStream("teams_save.txt");
            ObjectInputStream objectInputStream
                    = new ObjectInputStream(fileInputStream);
            teams = (ArrayList<Team>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Cannot load data. Saved data file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}