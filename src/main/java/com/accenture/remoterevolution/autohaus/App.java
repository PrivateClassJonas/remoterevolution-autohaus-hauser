package com.accenture.remoterevolution.autohaus;

import com.accenture.remoterevolution.autohaus.commando.*;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<Kraftfahrzeug> fahrzeuge = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        AddCommand addCommand = new AddCommand(scanner, fahrzeuge);
        ShowCommand showCommand = new ShowCommand(fahrzeuge);
        ShowIDCommand showIdCommand = new ShowIDCommand(fahrzeuge, scanner);
        ExitCommand exitCommand = new ExitCommand();
        HelpCommand helpCommand = new HelpCommand();
        DeleteCommand deleteCommand = new DeleteCommand(scanner, fahrzeuge);
        List<Command> commands = new ArrayList<Command>() {
            {
                add(addCommand);
                add(showCommand);
                add(exitCommand);
                add(deleteCommand);
                add(showIdCommand);
                add(helpCommand);
            }

        };
        System.out.println("Willkommen im Autohaus 'Jonas-Super-Krasse-Mega-Fahrzeuge'!");


        boolean isRunning = true;
        boolean isFound = false;
        while (isRunning) {
            isFound = false;
            String userCommand = scanner.nextLine();
            if (userCommand != null && userCommand.length() > 0) {


                for (Command command : commands) {
                    if (command.shouldExecute(userCommand)) {
                        isRunning = command.execute();
                        isFound = true;
                    }
                }
                if (!isFound) {
                    System.out.println("Der Befehl '" + userCommand + "' wurde nicht gefunden!");
                    System.out.println("'help' für mehr Informationen");
                }
            }
        }
    }
}
