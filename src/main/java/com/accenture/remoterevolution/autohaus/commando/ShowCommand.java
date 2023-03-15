package com.accenture.remoterevolution.autohaus.commando;

import com.accenture.remoterevolution.autohaus.Auto;
import com.accenture.remoterevolution.autohaus.Kraftfahrzeug;
import com.accenture.remoterevolution.autohaus.Motorrad;

import java.util.List;

public class ShowCommand implements Command {
    private List<Kraftfahrzeug> fahrzeuge;

    public ShowCommand(List<Kraftfahrzeug> fahrzeuge) {
        this.fahrzeuge = fahrzeuge;
    }

    @Override
    public boolean shouldExecute(String command) {
        return ("show".equalsIgnoreCase(command));
    }

    @Override
    public boolean execute() {
        if (!fahrzeuge.isEmpty()) {
            String newline = System.getProperty("line.separator");
            for (Kraftfahrzeug kraftfahrzeug : fahrzeuge) {
                if (kraftfahrzeug instanceof Auto)
                    System.out.println("Fahrzeug Typ: Auto, System-ID: " + kraftfahrzeug.getID());
                else if (kraftfahrzeug instanceof Motorrad)
                    System.out.println("Fahrzeug Typ: Motorrad, System-ID: " + kraftfahrzeug.getID());

                System.out.println("Fahrzeug Marke: " + kraftfahrzeug.getMarke());
                System.out.println("Fahrzeug Bezeichnung: " + kraftfahrzeug.getBezeichnung() + newline);
            }
        } else {
            System.out.println("Noch keine Fahrzeuge vorhanden!");
        }
        return true;
    }
}
