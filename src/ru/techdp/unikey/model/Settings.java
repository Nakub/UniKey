package ru.techdp.unikey.model;

import java.util.Arrays;

/**
 * Created by admin on 22.05.2016.
 */
public class Settings {

    private final String[][] options;

    public Settings(String[][] options) {
        Arrays.sort(options);
        this.options = options;
    }

    public String getOptionByName(String optionName) {
        int optionID = Arrays.binarySearch(options, optionName);
        return options[optionID ][1];
    }

}
