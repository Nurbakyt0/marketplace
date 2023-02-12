package org.example.cars.sport_utility_vehicles;

import jakarta.persistence.Entity;

@Entity
public class CompactSUVs extends SportUtilityVehicles{
    public CompactSUVs(String make, int price, String model, int year, int number_of_seats, String colour, String engine_displacement, int karkas_weight) {
        super(make, price, model, year, number_of_seats, colour, engine_displacement, karkas_weight);
    }

    public CompactSUVs() {
    }

    @Override
    public void print() {
        System.out.println(getId()+"\t"+getColour()+"\t"+getEngine_displacement()+"\t"+getMake()+"\t"+getModel()+"\t"+getNumber_of_seats()+"\t"+getPrice()+"\t"+getYear()+"\t"+getKarkas_weight());
    }
}
