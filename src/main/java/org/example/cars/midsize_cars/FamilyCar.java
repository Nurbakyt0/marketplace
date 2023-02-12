package org.example.cars.midsize_cars;

import jakarta.persistence.Entity;

@Entity
public class FamilyCar extends MidsizeCars{
    public FamilyCar(String make, int price, String model, int year, int number_of_seats, String colour, String engine_displacement, int passenger_space) {
        super(make, price, model, year, number_of_seats, colour, engine_displacement, passenger_space);
    }

    public FamilyCar() {
    }

    @Override
    public void print() {
        System.out.println(getId()+"\t"+getColour()+"\t"+getEngine_displacement()+"\t"+getMake()+"\t"+getModel()+"\t"+getNumber_of_seats()+"\t"+getPrice()+"\t"+getYear()+"\t"+getPassenger_space());
    }
}
