package com.accenture.remoterevolution.autohaus.commando;

import com.accenture.remoterevolution.autohaus.entities.AH_Autohaus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class ShowDataCommand implements Command {
    private Scanner scanner;
    private Connection connection;

    public ShowDataCommand(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    @Override
    public boolean shouldExecute(String command) {
        return ("showA".equalsIgnoreCase(command));
    }

    @Override
    public boolean execute() {
        String request = null;
        System.out.println("Was möchten Sie sehen?");
        request = scanner.nextLine();


        switch (request) {
            case "autohaus":
        }


        List<AH_Autohaus> autohaus = null;
        /*try {
            autohaus = readAutohausById(connection);
        } catch (SQLException ex) {
            System.out.println("Could not read Autohaus");
            return true;
        }**/
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
