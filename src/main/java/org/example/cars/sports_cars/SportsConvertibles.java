package org.example.cars.sports_cars;

import jakarta.persistence.Entity;

@Entity

public class SportsConvertibles extends SportCars{
    public SportsConvertibles(String make, int price, String model, int year, int number_of_seats, String colour, String engine_displacement, String antikrylo) {
        super(make, price, model, year, number_of_seats, colour, engine_displacement, antikrylo);
    }

    public SportsConvertibles() {
    }

    @Override
    public void print() {
        System.out.println(getId()+"\t"+getColour()+"\t"+getEngine_displacement()+"\t"+getMake()+"\t"+getModel()+"\t"+getNumber_of_seats()+"\t"+getPrice()+"\t"+getYear()+"\t"+getAntikrylo());
    }
}
