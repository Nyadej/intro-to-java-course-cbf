package com.cbfacademy.cars;

public class Car {
    
    //properties/instance fields
    private String make;
    private String model;
    private int year;
    private String colour;

    //constructors
    public Car(String make, String model, int year, String colour) {
        this.make = make;
        this.model = model;
        this.year = year; 
        this.colour = colour;
    }

    // methods to be called on the instance
    public String getMake() {
    return this.make;
    }

    public String getModel() {
        return this.model;
    }
    public int getYear () {
        return this.year;
    }

    public String getColour() {
        return this.colour;
    }
    public void setColour(String colour) { //using void because we are having to set the colour
        this.colour = colour;
    }

    //added this
    public String getDetails() {
       return getMake() + getModel() + getColour() + String.valueOf(getYear()); 
    }

    //instantiate three car objects:
    // Car volvo = new Car("Volvo", "V40", 2012, "black");
    // Car porshe = new Car("Porsche", "Panamera", 2009, "red");
    // Car audi = new Car("Audi","A3", 2018, "grey");

}