package com.accenture.remoterevolution.autohaus;

public abstract class Kraftfahrzeug {
    protected final Marken marke;
    protected final String bezeichnung;
    private int ID;


    protected Kraftfahrzeug(Marken marke, String bezeichnung) {
        this.marke = marke;
        this.bezeichnung = bezeichnung;
    }


    public Marken getMarke() {
        return marke;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public abstract void makeSound();
}
