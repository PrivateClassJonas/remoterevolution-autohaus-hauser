package com.accenture.remoterevolution.autohaus;

public class Motorrad extends Kraftfahrzeug {

    public Motorrad(Marken marke, String bezeichnung, int id) {
        super(marke, bezeichnung);
        this.setID(id);
    }

    @Override
    public void makeSound() {

    }
}
