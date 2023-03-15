package com.accenture.remoterevolution.autohaus;

public class Auto extends Kraftfahrzeug {


    public Auto(Marken marke, String bezeichnung, int id) {
        super(marke, bezeichnung);
        this.setID(id);

    }

    @Override
    public void makeSound() {

    }
}
