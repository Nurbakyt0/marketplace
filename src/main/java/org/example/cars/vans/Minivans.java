package org.example.cars.vans;

import jakarta.persistence.Entity;

@Entity
public class Minivans extends Vans{
    public Minivans(String make, int price, String model, int year, int number_of_seats, String colour, String engine_displacement, String captain_seat) {
        super(make, price, model, year, number_of_seats, colour, engine_displacement, captain_seat);
    }

    public Minivans() {
    }

    @Override
    public void print() {
        System.out.println(getId()+"\t"+getColour()+"\t"+getEngine_displacement()+"\t"+getMake()+"\t"+getModel()+"\t"+getNumber_of_seats()+"\t"+getPrice()+"\t"+getYear()+"\t"+getCaptain_seat());
    }
}
