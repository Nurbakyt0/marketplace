package org.example.cars.trucks;

import jakarta.persistence.Entity;

@Entity
public class LightDutyTruck extends Trucks{
    public LightDutyTruck(String make, int price, String model, int year, int number_of_seats, String colour, String engine_displacement, int trunk_volume) {
        super(make, price, model, year, number_of_seats, colour, engine_displacement, trunk_volume);
    }

    public LightDutyTruck() {
    }

    @Override
    public void print() {
        System.out.println(getId()+"\t"+getColour()+"\t"+getEngine_displacement()+"\t"+getMake()+"\t"+getModel()+"\t"+getNumber_of_seats()+"\t"+getPrice()+"\t"+getYear()+"\t"+getTrunk_volume());
    }
}
