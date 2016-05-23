package ru.techdp.unikey.controller;

import ru.techdp.unikey.model.Glossary;

/**
 * Created by admin on 22.05.2016.
 */
public class Translator {

    public static int translate (int inCommandID, Glossary glossary) {
        return glossary.getOutCommandID(inCommandID);
    }
}
