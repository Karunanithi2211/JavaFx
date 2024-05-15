package com.nivak.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseDriver  {

    private Connection conn;

    public DatabaseDriver() {
        try {
           this.conn = DriverManager.getConnection("jdbc:sqlite:nivakbank.db");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * Client Section
    */

    public ResultSet getClientData(String pAddress, String password){
        Statement statement;
        ResultSet resultSet = null;

        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery("select * from Clients Where PayeeAddress ='"+pAddress+"'And password = '"+password+"';");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    /*
     * Admin Section
    */


    /*
     * Utility Methods
    */
}

