package ru.techdp.unikey.model;

import java.util.ArrayList;


public class Settings {

    private final ArrayList optionNames;

    private final ArrayList optionValues;

    public Settings(ArrayList optionNames, ArrayList optionValues) {
        this.optionNames = optionNames;
        this.optionValues = optionValues;
    }

    public String getOptionByName (String optionName) {
        int optionIndex = this.optionNames.indexOf(optionName);
        return (String)this.optionValues.get(optionIndex);
    }

    //    private final String[][] options;
//
//    public Settings(String[][] options) {
//        Arrays.sort(options);
//        this.options = options;
//    }
//
//    public String getOptionByName(String optionName) {
//        int optionID = Arrays.binarySearch(options, optionName);
//        return options[optionID ][1];
//    }

}

