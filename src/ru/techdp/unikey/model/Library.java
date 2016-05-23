package ru.techdp.unikey.model;

import java.util.Arrays;

/**
 * Created by admin on 22.05.2016.
 */
public class Library {

    private final String[] commands;


    public Library(String[] commands) {
        Arrays.sort(commands);
        this.commands = commands;
    }

    public String getCommand(int commandID) {
        return commands [commandID];
    }

//    public int getCommandID(String command) {
//        String value;
//        int i = 0;
//        do {value = commands[i];
//            i++;
//        } while (!command.equals(value));
//        return i-1;
//
//    }
    public int getCommandID(String command) {
        return Arrays.binarySearch(this.commands, command);
    }

}
