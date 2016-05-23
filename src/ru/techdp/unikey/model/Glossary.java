package ru.techdp.unikey.model;


/**
 * Created by admin on 22.05.2016.
 */
public class Glossary {

    private final int[] outCommandID;


    public Glossary(int[] outCommandID) {
        this.outCommandID = outCommandID;
    }

    public int getOutCommandID(int inCommandID) {
       return outCommandID [inCommandID];
    }

}
