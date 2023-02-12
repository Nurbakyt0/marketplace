package org.example.cars.compact_cars;

import jakarta.persistence.Entity;

@Entity
public class Superminis extends CompactCars{

    public Superminis(String make, int price, String model, int year, int number_of_seats, String colour, String engine_displacement, String dovodchik) {
        super(make, price, model, year, number_of_seats, colour, engine_displacement, dovodchik);

    }

    public Superminis() {
    }

    @Override
    public void print() {
        System.out.println(getId()+"\t"+getColour()+"\t"+getEngine_displacement()+"\t"+getMake()+"\t"+getModel()+"\t"+getNumber_of_seats()+"\t"+getPrice()+"\t"+getYear()+"\t"+getDovodchik());

    }
}
