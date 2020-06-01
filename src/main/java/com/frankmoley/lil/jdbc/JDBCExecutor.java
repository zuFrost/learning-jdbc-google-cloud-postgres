package com.frankmoley.lil.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecutor {

    public static void main(String... args){

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("35.228.145.9","hplussport", "postgres", "9021090210");
        try{
            Connection connection = dcm.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM customer");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
