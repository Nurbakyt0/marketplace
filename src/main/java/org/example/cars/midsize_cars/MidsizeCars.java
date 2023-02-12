package org.example.cars.midsize_cars;

import jakarta.persistence.MappedSuperclass;
import org.example.cars.Car;

@MappedSuperclass
abstract public class MidsizeCars extends Car {
    protected int passenger_space;
    public MidsizeCars(String make,int price, String model,int year, int number_of_seats,String colour,String engine_displacement,int passenger_space){
        super(make,price,model,year,number_of_seats,colour,engine_displacement);
        this.passenger_space=passenger_space;
    }

    public int getPassenger_space() {
        return passenger_space;
    }

    public void setPassenger_space(int passenger_space) {
        this.passenger_space = passenger_space;
    }

    public MidsizeCars() {
    }

}
