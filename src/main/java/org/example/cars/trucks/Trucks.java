package org.example.cars.trucks;

import jakarta.persistence.MappedSuperclass;
import org.example.cars.Car;
@MappedSuperclass
abstract public class Trucks extends Car {
    protected int trunk_volume;
    public Trucks(String make,int price, String model,int year, int number_of_seats,String colour,String engine_displacement,int trunk_volume){
        super(make,price,model,year,number_of_seats,colour,engine_displacement);
        this.trunk_volume=trunk_volume;
    }

    public int getTrunk_volume() {
        return trunk_volume;
    }

    public void setTrunk_volume(int trunk_volume) {
        this.trunk_volume = trunk_volume;
    }

    public Trucks() {

    }
}
