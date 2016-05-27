package ru.techdp.unikey.model;


import java.util.ArrayList;

public class Glossary {

    private final ArrayList outCommandID;


    public Glossary(ArrayList outCommandID) {
        this.outCommandID = outCommandID;
    }

    public int getOutCommandID(int inCommandID) {
       return (int)outCommandID.get(inCommandID);
    }

}
