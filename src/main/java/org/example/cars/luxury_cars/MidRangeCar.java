package org.example.cars.luxury_cars;

import jakarta.persistence.Entity;

@Entity
public class MidRangeCar extends LuxuryCars {
    public MidRangeCar(String make, int price, String model, int year, int number_of_seats, String colour, String engine_displacement, String panorama) {
        super(make, price, model, year, number_of_seats, colour, engine_displacement, panorama);
    }

    public MidRangeCar() {
    }

    @Override
    public void print() {
        System.out.println(getId()+"\t"+getColour()+"\t"+getEngine_displacement()+"\t"+getMake()+"\t"+getModel()+"\t"+getNumber_of_seats()+"\t"+getPrice()+"\t"+getYear()+"\t"+getPanorama());
    }
}
