package database;

import java.sql.*;

public class demo {
    public static void main(String[] args) {
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            String databalseURL="jdbc:mysql://localhost:3306/school?characterEncoding=utf8";
            String user="root";
            String pass="123qwe!@#";
            connection = DriverManager
                    .getConnection(databalseURL, user, pass);
            System.out.println("SQL Connection to database established!");




        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console"  + e);
            return;
        }
    }
}
