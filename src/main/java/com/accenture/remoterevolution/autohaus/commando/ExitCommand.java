package com.accenture.remoterevolution.autohaus.commando;

import java.sql.SQLOutput;

public class ExitCommand implements Command {

    public ExitCommand() {

    }

    @Override
    public boolean shouldExecute(String command) {
        return ("exit".equalsIgnoreCase(command));
    }

    @Override
    public boolean execute() {
        System.out.println("Bis zum nächsten mal!");
        return false;
    }
}
