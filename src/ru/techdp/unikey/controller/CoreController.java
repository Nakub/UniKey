package ru.techdp.unikey.controller;

import ru.techdp.unikey.model.Device;
import ru.techdp.unikey.model.Glossary;

import java.awt.*;
import java.awt.event.MouseEvent;


public class CoreController {
    private final Device inputDevice;
    private final Device outputDevice;
    private final Glossary glossary;

    public CoreController(Device inputDevice, Device outputDevice, Glossary glossary) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
        this.glossary = glossary;
    }

    public Device getInputDevice() {
        return inputDevice;
    }

    public Device getOutputDevice() {
        return outputDevice;
    }

    public String receive(String inCommand) {
        int inCommandID = Converter.inConvert(inputDevice, inCommand);
        int outCommandID = Translator.translate(inCommandID, glossary);
        return this.transmit(outCommandID);
    }

    public String transmit(int outCommandID) {
        return Converter.outConvert(outputDevice, outCommandID);
    }
}
