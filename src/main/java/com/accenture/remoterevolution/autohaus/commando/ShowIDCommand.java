package com.accenture.remoterevolution.autohaus.commando;

import com.accenture.remoterevolution.autohaus.Auto;
import com.accenture.remoterevolution.autohaus.Kraftfahrzeug;
import com.accenture.remoterevolution.autohaus.Motorrad;

import java.util.List;
import java.util.Scanner;

public class ShowIDCommand implements Command {
    private List<Kraftfahrzeug> fahrzeuge;
    private Scanner scanner;

    public ShowIDCommand(List<Kraftfahrzeug> fahrzeuge, Scanner scanner) {
        this.fahrzeuge = fahrzeuge;
        this.scanner = scanner;
    }

    @Override
    public boolean shouldExecute(String command) {
        return ("showID".equalsIgnoreCase(command));
    }

    @Override
    public boolean execute() {
        if (!fahrzeuge.isEmpty()) {
            System.out.println("Wie lautet die Fahrzeug-ID?");
            int id = 0;
            String id_text = scanner.nextLine();
            try {
                id = Integer.parseInt(id_text);
                for (Kraftfahrzeug kraftfahrzeug : fahrzeuge) {
                    if (id <= fahrzeuge.size() && id > 0) {
                        if (kraftfahrzeug.getID() == id) {
                            if (kraftfahrzeug instanceof Auto)
                                System.out.println("Fahrzeug Typ: Auto, System-ID: " + kraftfahrzeug.getID());
                            else if (kraftfahrzeug instanceof Motorrad)
                                System.out.println("Fahrzeug Typ: Motorrad, System-ID: " + kraftfahrzeug.getID());

                            System.out.println("Fahrzeug Marke: " + kraftfahrzeug.getMarke());
                            System.out.println("Fahrzeug Bezeichnung: " + kraftfahrzeug.getBezeichnung());
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

        return true;
    }
}
