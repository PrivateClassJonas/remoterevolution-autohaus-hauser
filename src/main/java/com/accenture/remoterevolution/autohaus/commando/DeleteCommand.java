package com.accenture.remoterevolution.autohaus.commando;

import com.accenture.remoterevolution.autohaus.Kraftfahrzeug;

import java.util.List;
import java.util.Scanner;

public class DeleteCommand implements Command {

    private Scanner scanner;
    private List<Kraftfahrzeug> fahrzeuge;

    public DeleteCommand(Scanner scanner, List<Kraftfahrzeug> fahrzeuge) {
        this.scanner = scanner;
        this.fahrzeuge = fahrzeuge;
    }

    @Override
    public boolean shouldExecute(String command) {
        return ("delete".equalsIgnoreCase(command));
    }

    @Override
    public boolean execute() {

        System.out.println("Welches Fahrzeug soll gelöscht werden (ID)?");
        int id = 0;
        String id_text = scanner.nextLine();
        try {
            id = Integer.parseInt(id_text);
            for (Kraftfahrzeug kraftfahrzeug : fahrzeuge) {
                if (id <= fahrzeuge.size() && id > 0) {
                    if (kraftfahrzeug.getID() == id) {
                        fahrzeuge.remove(kraftfahrzeug);
                        System.out.println("Das Fahrzeug mit der ID: " + id + " wurde erfolgreich gelöscht!");
                        refreshIDs(fahrzeuge);
                        break;
                    }
                } else {
                    System.out.println("Es ist kein Fahrzeug mit der ID: " + id + " vorhanden!");
                }
            }
        } catch (NumberFormatException nfe) {
            System.out.println(id_text + " ist keine gültige ID!");
        }


        return true;
    }

    private void refreshIDs(List<Kraftfahrzeug> fahrzeuge) {
        int newID = 1;
        for (Kraftfahrzeug kraftfahrzeug : fahrzeuge) {
            if (kraftfahrzeug.getID() != newID)
                kraftfahrzeug.setID(newID);

            newID++;
        }
    }
}
