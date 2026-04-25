package com.pavan_practice.dao_implementation;

import com.pavan_practice.dao.CarsDAO;
import com.pavan_practice.model.Cars;

import java.sql.*;
import java.util.List;

public class CarsDAOImplementation implements CarsDAO {
    private final String url = System.getenv("DB_URL");
    private final String user = System.getenv("USER_NAME");
    private final String password = System.getenv("DB_PASSWORD");

    private Connection getConnection() {
        try{Class.forName("org.postgresql.Driver");

        return DriverManager.getConnection(url+"april_db",user,password);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void createTable() throws SQLException {
        Statement statement = getConnection().createStatement();
        statement.executeQuery("CREATE table Makes (id INT PRIMARY KEY, make Varchar(20),model VARCHAR(50),color varchar(20), engineCapacity INT ,engine INT ,category varchar(20));    ");
    }

    @Override
    public void addCar(Cars car,int id)  {
       try{
           Connection connection = getConnection();
           PreparedStatement ps = connection.prepareStatement("INSERT INTO makes (id,make,model,color,engineCapacity,engine,category) VALUES (?,?,?,?,?,?,?)");
           ps.setInt(1,id);
           ps.setString(2, car.getMake());
           ps.setString(3,car.getModel());
           ps.setString(4,car.getColor());
           ps.setInt(5,car.getEngineCapacity());
           ps.setInt(6,car.getEngine());
           ps.setString(7,car.getCategory());

           ps.executeUpdate();
           System.out.println("Car Added Successfully!");

       }catch (Exception e){
           e.printStackTrace();
       }
    }

    @Override
    public void updateCar(Cars car) {
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE makes set model=? WHERE id=?");
            ps.setString(1, car.getModel());
            ps.setInt(2,555);
            ps.execute();
            System.out.println("Updated "+ car.getModel());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//    @Override
//    public List<Cars> getAllMakes(){
//
//    }

    @Override
    public void deleteCar( int id){

    }
}
