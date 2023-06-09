package com.accenture.remoterevolution.autohaus.commando;

import com.accenture.remoterevolution.autohaus.Auto;
import com.accenture.remoterevolution.autohaus.Kraftfahrzeug;
import com.accenture.remoterevolution.autohaus.Motorrad;
import com.accenture.remoterevolution.autohaus.entities.AH_Autohaus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowIDCommand implements Command {
    //private List<Kraftfahrzeug> fahrzeuge;
    private Scanner scanner;
    private Connection connection;

    public ShowIDCommand(Connection connection, Scanner scanner) {
        //this.fahrzeuge = fahrzeuge;
        this.connection = connection;
        this.scanner = scanner;
    }

    @Override
    public boolean shouldExecute(String command) {
        return ("showID".equalsIgnoreCase(command));
    }

    @Override
    public boolean execute() {
        Long id = null;
        System.out.println("Welche ID?");
        try {
            id = Long.parseLong(scanner.nextLine());

        } catch (Exception e) {
            if (id != null)
                System.out.println(id.toString() + " ist keine gültige ID!");
            else System.out.println("Ungültige Eingabe!");
            return true;
        }
        List<AH_Autohaus> autohaus = null;
        try {
            autohaus = readAutohausById(connection, id);
        } catch (SQLException ex) {
            System.out.println("Could not read Autohaus");
            return true;
        }
        for (AH_Autohaus autohau : autohaus) {
            System.out.println("Autohaus-ID: " + autohau.getAutohausId() + ", Autohaus-Adresse: " + autohau.getAutohausAdresse());
        }
/*
        PreparedStatement preparedStatement =
                connection.prepareStatement("select * from account where login_name like ?");
        preparedStatement.setString(1, startChar + "%");

        ResultSet resultSet = preparedStatement.executeQuery();

        List<Account> result = new ArrayList<>();**/

        return true;
    }

    private List<AH_Autohaus> readAutohausById(Connection connection, Long id) throws SQLException {
        PreparedStatement preparedStatement =
                connection.prepareStatement("select * from AH_Autohaus where ah_autohaus_id = ?");
        preparedStatement.setLong(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        List<AH_Autohaus> result = new ArrayList<>();

        while (resultSet.next()) {
            Long autohausId = resultSet.getLong("AH_Autohaus_ID");
            String autohausAdd = resultSet.getString("AH_Autohaus_Adresse");

            AH_Autohaus a = new AH_Autohaus();
            a.setAutohausId(autohausId);
            a.setAutohausAdresse(autohausAdd);

            result.add(a);
        }

        return result;
    }
}
