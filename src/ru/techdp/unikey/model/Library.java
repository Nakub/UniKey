package ru.techdp.unikey.model;

import java.util.ArrayList;
import java.util.Arrays;


public class Library {

    private final ArrayList commands;


    public Library(ArrayList commands) {
        this.commands = commands;
    }

    public String getCommand(int commandID) {
        return (String)commands.get(commandID);
    }

    public int getCommandID(String command) {
        return commands.indexOf(command) ;
    }

}
