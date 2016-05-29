package ru.techdp.unikey.model;


public class Device {

    private final int id;
    private final String name;
    private final Settings settings;
    private final Library library;

    public Device(int id, String name, Settings settings, Library library) {
        this.id = id;
        this.name = name;
        this.settings = settings;
        this.library = library;
    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.id;
    }

    public Settings getSettings() {
        return this.settings;
    }

    public Library getLibrary() {
        return this.library;
    }
}