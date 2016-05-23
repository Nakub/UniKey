package ru.techdp.unikey.controller;


import ru.techdp.unikey.model.Device;
import ru.techdp.unikey.model.Library;

/**
 * Created by admin on 22.05.2016.
 */
public class Converter {

    public static int inConvert(Device device, String command) {
        Library library = device.getLibrary();
        return library.getCommandID(command);
    }

    public static String outConvert(Device device, int commandID) {
        Library library = device.getLibrary();
        return library.getCommand(commandID);
    }

}
