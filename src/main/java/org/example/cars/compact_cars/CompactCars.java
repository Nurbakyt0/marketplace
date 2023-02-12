package org.example.cars.compact_cars;

import jakarta.persistence.MappedSuperclass;
import org.example.cars.Car;

@MappedSuperclass
abstract public class CompactCars extends Car {

    String dovodchik;
    public CompactCars(String make,int price, String model,int year, int number_of_seats,String colour,String engine_displacement,String dovodchik){
        super(make,price,model,year,number_of_seats,colour,engine_displacement);
        this.dovodchik=dovodchik;
    }

    public String getDovodchik() {
        return dovodchik;
    }

    public void setDovodchik(String dovodchik) {
        this.dovodchik = dovodchik;
    }

    public CompactCars(){
    }
}
