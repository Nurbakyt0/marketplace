package org.example.cars.sport_utility_vehicles;

import jakarta.persistence.MappedSuperclass;
import org.example.cars.Car;

@MappedSuperclass
abstract public class SportUtilityVehicles extends Car {
    protected int karkas_weight;
    public SportUtilityVehicles(String make,int price, String model,int year, int number_of_seats,String colour,String engine_displacement,int karkas_weight){
        super(make,price,model,year,number_of_seats,colour,engine_displacement);
        this.karkas_weight=karkas_weight;
    }


    public int getKarkas_weight() {
        return karkas_weight;
    }

    public void setKarkas_weight(int karkas_weight) {
        this.karkas_weight = karkas_weight;
    }

    public SportUtilityVehicles() {
    }

}
