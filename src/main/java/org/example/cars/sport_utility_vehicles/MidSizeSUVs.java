package org.example.cars.sport_utility_vehicles;

import jakarta.persistence.Entity;

@Entity
public class MidSizeSUVs extends SportUtilityVehicles{
    public MidSizeSUVs(String make, int price, String model, int year, int number_of_seats, String colour, String engine_displacement, int karkas_weight) {
        super(make, price, model, year, number_of_seats, colour, engine_displacement, karkas_weight);
    }

    public void setKarkas_weight(int karkas_weight) {
        this.karkas_weight = karkas_weight;
    }

    public int getKarkas_weight() {
        return karkas_weight;
    }

    public MidSizeSUVs() {
    }

    @Override
    public void print() {
        System.out.println(getId()+"\t"+getColour()+"\t"+getEngine_displacement()+"\t"+getMake()+"\t"+getModel()+"\t"+getNumber_of_seats()+"\t"+getPrice()+"\t"+getYear()+"\t"+getKarkas_weight());
    }
}
