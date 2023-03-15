package com.accenture.remoterevolution.autohaus.commando;

public interface Command {

    boolean shouldExecute(String command);

    boolean execute();


}
