package com.example.freemoneynoscam.jdbc_data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcNoScam {
    static Statement stmt;
    static ResultSet rs;
    static String sqlString;
    static Connection con;


    public static void connectToDB () {
        System.out.println("connecting to DB");
        try
        {
            //Define URL of database server for database named test_hotel
            //on the localhost with the default port number 3306.
            String url = "jdbc:mysql://localhost:3306/free_money";

            //Get a connection to the database for a user named root with password admin
            con = DriverManager.getConnection(url,"root","mads568g@stud.kea.dkMaddog115");

            //Display the URL and connection information
            System.out.println("URL: " + url);
            System.out.println("Connection: " + con);

            //Get a Statement object
            stmt = con.createStatement();

        }
        catch( Exception e )
        {
            e.printStackTrace();
        }


    }


    public static void insertData(String email) {

        String insertSQL = "INSERT INTO user_email" + "(`email`)" + "VALUES ('"+email+"')";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(insertSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
