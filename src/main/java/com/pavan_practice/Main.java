package com.pavan_practice;
import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(System.getenv("DB_URL")+"april_db",
                    System.getenv("USER_NAME"),
                    System.getenv("DB_PASSWORD"));
            Statement statement = connection.createStatement();
            statement.executeQuery("CREATE DATABASE projects_db");
            System.out.println("Database Created Successfully!!");
            connection.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        }

}
