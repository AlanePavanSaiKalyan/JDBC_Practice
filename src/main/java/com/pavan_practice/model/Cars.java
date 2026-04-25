package com.pavan_practice.model;

public class Cars {
    private String make;
    private String model;
    private String color;
    private int engineCapacity;
    private int engine;
    private String category;

    public Cars(String make, String model, String color, int engineCapacity, int engine, String category){
        this.model = model;
        this.make = make;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.engine = engine;
        this.category = category;
    }
    public void setMake(String make){
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMake(){
        return make;
    }

}
