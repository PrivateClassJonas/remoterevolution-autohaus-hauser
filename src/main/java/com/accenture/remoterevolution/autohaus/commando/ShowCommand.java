package com.accenture.remoterevolution.autohaus.commando;

import com.accenture.remoterevolution.autohaus.Auto;
import com.accenture.remoterevolution.autohaus.Kraftfahrzeug;
import com.accenture.remoterevolution.autohaus.Motorrad;
import com.accenture.remoterevolution.autohaus.entities.AH_Autohaus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ShowCommand implements Command {
    //private List<Kraftfahrzeug> fahrzeuge;
    private Connection connection;

    public ShowCommand(/*List<Kraftfahrzeug> fahrzeuge**/Connection connection) {
        //this.fahrzeuge = fahrzeuge;
        this.connection = connection;
    }

    @Override
    public boolean shouldExecute(String command) {
        return ("show".equalsIgnoreCase(command));
    }

    @Override
    public boolean execute() {

        System.out.println("Liste von allen Autohäusern:");
        List<AH_Autohaus> autohaus = null;
        try {
            autohaus = readAutohaus(connection);

        } catch (SQLException ex) {
            System.out.println("Could not read Autohaus");
            return true;
        }
        for (AH_Autohaus autohau : autohaus) {
            System.out.println("Autohaus-ID: " + autohau.getAutohausId() + ", Autohaus-Adresse: " + autohau.getAutohausAdresse());
        }

        return true;
    }

    private List<AH_Autohaus> readAutohaus(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        //System.out.println("Schema: " + connection.getSchema().toString());
        ResultSet resultSet = statement.executeQuery("select * from AH_Autohaus");
        List<AH_Autohaus> result = new ArrayList<>();
        Properties clientInfos = null;
        String username = null;
        try {
            clientInfos = connection.getClientInfo();
            username = clientInfos.toString();
            clientInfos.list(System.out);
            username = clientInfos.getProperty("user");
            username = clientInfos.getProperty("root");
        } catch (Exception e) {
            System.out.println("topkek");
        }
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
