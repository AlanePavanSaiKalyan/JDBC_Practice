package com.pavan_practice;
import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String url = System.getenv("DB_URL"+"april_db");
        String userName = System.getenv("USER_NAME");
        String password = System.getenv("DB_PASSWORD");
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/april_db",
                    "postgres",
                    "Alpha@2001");
            Statement statement = connection.createStatement();
            statement.executeQuery("CREATE DATABASE projects_db");
            System.out.println("Database Created Successfully!!");
            connection.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        }

}
