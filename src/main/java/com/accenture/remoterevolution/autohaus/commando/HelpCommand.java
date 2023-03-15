package com.accenture.remoterevolution.autohaus.commando;

public class HelpCommand implements Command{
    @Override
    public boolean shouldExecute(String command) {
        return ("help".equalsIgnoreCase(command));
    }

    @Override
    public boolean execute() {
        System.out.println("Folgende Befehle können ausgeführt werden: ");
        System.out.println("'show' - Zeige alle Fahrzeuge, 'showid' - Zeige ein Fahrzeug mit einer bestimmten ID");
        System.out.println("'delete' - Lösche ein Fahrzeug mit einer bestimmten ID, 'exit' - Verlasse die App");
        System.out.println("'add' - Füge ein neues Fahrzeug hinzu");
        return true;
    }
}
