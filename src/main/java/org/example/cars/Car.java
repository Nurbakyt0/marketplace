package org.example.cars;

import jakarta.persistence.*;

@MappedSuperclass
abstract public class Car {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    protected String make;
    protected String model;
    protected int year;
    protected int number_of_seats;
    protected String colour;
    protected int price;
    protected String engine_displacement;

    public Car(String make,int price, String model,int year, int number_of_seats,String colour,String engine_displacement) {
        this.make= make;
        this.price=price;
        this.model=model;
        this.year=year;
        this.number_of_seats=number_of_seats;
        this.colour= colour;
        this.engine_displacement=engine_displacement;
    }


    protected Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEngine_displacement() {
        return engine_displacement;
    }

    public void setEngine_displacement(String engine_displacement) {
        this.engine_displacement = engine_displacement;
    }

    public void print() {
    }
}
