package org.example.cars.sports_cars;

import jakarta.persistence.MappedSuperclass;
import org.example.cars.Car;
@MappedSuperclass
abstract public class SportCars extends Car {
    protected String antikrylo;
    public SportCars(String make,int price, String model,int year, int number_of_seats,String colour,String engine_displacement,String antikrylo){
        super(make,price,model,year,number_of_seats,colour,engine_displacement);
        this.antikrylo=antikrylo;
    }

    public String getAntikrylo() {
        return antikrylo;
    }

    public void setAntikrylo(String antikrylo) {
        this.antikrylo = antikrylo;
    }

    public SportCars() {

    }
}
