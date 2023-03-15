package com.accenture.remoterevolution.autohaus.commando;

import com.accenture.remoterevolution.autohaus.Auto;
import com.accenture.remoterevolution.autohaus.Kraftfahrzeug;
import com.accenture.remoterevolution.autohaus.Marken;
import com.accenture.remoterevolution.autohaus.Motorrad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddCommand implements Command {

    private Scanner scanner;
    private List<Kraftfahrzeug> fahrzeuge;
    private List<String> marken = Arrays.asList("bmw", "audi", "mercedes", "vw");

    public AddCommand(Scanner scanner, List<Kraftfahrzeug> fahrzeuge) {
        this.scanner = scanner;
        this.fahrzeuge = fahrzeuge;
    }

    @Override
    public boolean shouldExecute(String command) {
        return ("add".equalsIgnoreCase(command));
    }

    @Override
    public boolean execute() {
        String marke = null;
        String typ = null;
        String bezeichnung = null;
        System.out.println("Füge ein Fahrzeug hinzu!");
        System.out.println("Welcher Typ? Mögliche: Motorrad oder Auto");
        typ = scanner.nextLine();
        if ("auto".equalsIgnoreCase(typ)) {
            System.out.println("Welche Marke? Mögliche: Audi, Mercedes, BMW oder VW");
            marke = scanner.nextLine();
            if (marken.contains(marke.toLowerCase())) {
                System.out.println("Welche Bezeichnung soll das Fahrzeug haben?");
                bezeichnung = scanner.nextLine();
                switch (marke.toLowerCase()) {
                    case "bmw":
                        fahrzeuge.add(new Auto(Marken.BMW, bezeichnung, (fahrzeuge.size()) + 1));
                        break;
                    case "mercedes":
                        fahrzeuge.add(new Auto(Marken.Mercedes, bezeichnung, (fahrzeuge.size()) + 1));
                        break;
                    case "audi":
                        fahrzeuge.add(new Auto(Marken.Audi, bezeichnung, (fahrzeuge.size()) + 1));
                        break;
                    case "vw":
                        fahrzeuge.add(new Auto(Marken.VW, bezeichnung, (fahrzeuge.size()) + 1));
                        break;
                }
                System.out.println("Das Fahrzeug wurde erfolgreich hinzugefügt!");
                return true;
            } else {
                fail();
                return true;
            }
        } else if ("motorrad".equalsIgnoreCase(typ)) {
            System.out.println("Welche Marke? Mögliche: Audi, Mercedes, BMW oder VW");
            marke = scanner.nextLine();
            if (marken.contains(marke.toLowerCase())) {
                System.out.println("Welche Bezeichnung soll das Fahrzeug haben?");
                bezeichnung = scanner.nextLine();
                switch (marke.toLowerCase()) {
                    case "bmw":
                        fahrzeuge.add(new Motorrad(Marken.BMW, bezeichnung, (fahrzeuge.size()) + 1));
                        break;
                    case "mercedes":
                        fahrzeuge.add(new Motorrad(Marken.Mercedes, bezeichnung, (fahrzeuge.size()) + 1));
                        break;
                    case "audi":
                        fahrzeuge.add(new Motorrad(Marken.Audi, bezeichnung, (fahrzeuge.size()) + 1));
                        break;
                    case "vw":
                        fahrzeuge.add(new Motorrad(Marken.VW, bezeichnung, (fahrzeuge.size()) + 1));
                        break;
                }
                System.out.println("Das Fahrzeug wurde erfolgreich hinzugefügt!");
                return true;
            } else {
                fail();
                return true;
            }
        } else {
            fail();
            return true;
        }
    }

    private void fail() {
        System.out.println("Eingabe nicht erkannt! 'Add' um es noch einmal zu versuchen");
    }

}
