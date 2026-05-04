package com.pavan_practice;

import com.pavan_practice.dao.CarsDAO;
import com.pavan_practice.dao_implementation.CarsDAOImplementation;
import com.pavan_practice.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarsMain {
    static void main() {

        CarsDAO cd = new CarsDAOImplementation();
        cd.addCar(new Cars("Bugatti","Chiron","Blue",1479,16,"Hyper"),109);
//        cd.updateCar(new Cars("FORD", "MUSTANG GT","Green",5,6,"Muscle"),555);
        List<Cars> carsList = new ArrayList<>(cd.getAllMakes());
        for(Cars car:carsList){
            System.out.println("Make "+car.getMake()+", Model: "+car.getModel()+", Color:"+car.getColor()+", EngineCapacity:"+car.getEngineCapacity()+", Engine:"+car.getEngine()+", Category:"+car.getCategory());
        }
//        cd.deleteCar(103);
    }
}
