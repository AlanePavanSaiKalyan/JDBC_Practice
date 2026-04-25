package com.pavan_practice;

import com.pavan_practice.dao.CarsDAO;
import com.pavan_practice.dao_implementation.CarsDAOImplementation;
import com.pavan_practice.model.Cars;

public class CarsMain {
    static void main() {
//        CarsDAOImplementation c = new CarsDAOImplementation();
//        try {
//            c.createTable();
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//
//        }
        CarsDAO cd = new CarsDAOImplementation();
        cd.updateCar(new Cars("FORD", "MUSTANG GT","Green",5,6,"Muscle"),555);
    }
}
