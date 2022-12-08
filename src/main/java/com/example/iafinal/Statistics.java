package com.example.iafinal;

import java.io.Serializable;
import java.util.ArrayList;

public class Statistics implements Serializable {
    //Counter for the skills that the user requested.
    // If the skill is false, then the player hasn't preformed it well. If it is true then the user has preformed it well.


    static int trueService = 0;

    static int falseService = 0;
    static int tureSpike= 0;
    static int falseSpike= 0;
    static int trueSet = 0;
    static int falseSet= 0;
    static int trueReceiving = 0;
    static int falseReceiving = 0;
    static int trueBlock = 0;
    static int falseBlock = 0;

    float accuracy = 10;

    //empty constructor
    public Statistics() {
    }

    // all of these methods add to their counter when they are called
    public void trueServiceAdd(){
        trueService++;
        System.out.println(trueService);
    }
    public void falseServiceAdd(){
        falseService++;
        System.out.println(falseService);
    }
    public void tureSpikeAdd(){
        tureSpike++;
    }
    public void falseSpikeAdd(){
        falseSpike++;
    }
    public void trueSetAdd(){
        trueSet++;
    }
    public void falseSetAdd(){
        falseSet++;
    }
    public void trueReceivingAdd(){
        trueReceiving++;
    }
    public void falseReceivingAdd(){
        falseReceiving++;
    }
    public void trueBlockAdd(){
        trueBlock++;
    }
    public void falseBlockAdd(){
        falseBlock++;
    }

    //calculates the total accuracy of the player
    public void playerAccuracy(){
        accuracy = (float) (trueService + 1/(trueService + falseService + 1)) + (tureSpike + 1/(tureSpike + falseSpike + 1)) + (trueSet + 1/(trueSet + falseSet + 1)) + (trueReceiving + 1/(trueReceiving + falseReceiving + 1)) + (trueBlock + 1/(trueBlock + falseBlock + 1));
    }

    public static int getTrueService() {
        return trueService;
    }
    public static int getFalseService() {
        return falseService;
    }


    // trueService/(trueService + falseService) + trueSpike/(trueSpike + falseSpike) + (all of them)
    // maximum possible score in accuracy = 5
    // if the player has many falses, 0 = the minimum accuracy a player could have.



}
