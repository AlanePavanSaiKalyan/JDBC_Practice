package com.pavan_practice.dao;

import com.pavan_practice.model.Cars;

import java.util.List;

public interface CarsDAO {
    void addCar(Cars car,int id);
    void updateCar(Cars car,int id);
    void deleteCar(int id);
    List<Cars> getAllMakes();
}
