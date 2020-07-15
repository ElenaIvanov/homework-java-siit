package com.siit.week15.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnexion {
    public static PreparedStatement getPreparedStatement(String query){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?serverTimezone=EET","siit", "siit");
            return connection.prepareStatement(query);
        } catch (SQLException e) {
            System.out.println("Error occurred while getting the connection!");
            throw new RuntimeException("Error occurred while getting the connection!\"", e);
        }
    }

}
