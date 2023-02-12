package org.example.cars.luxury_cars;

import jakarta.persistence.MappedSuperclass;
import org.example.cars.Car;

@MappedSuperclass
abstract public class LuxuryCars extends Car {
    String panorama;
    public LuxuryCars(String make,int price, String model,int year, int number_of_seats,String colour,String engine_displacement,String panorama){
        super(make,price,model,year,number_of_seats,colour,engine_displacement);
        this.panorama=panorama;
    }

    public String getPanorama() {
        return panorama;
    }

    public void setPanorama(String panorama) {
        this.panorama = panorama;
    }

    public LuxuryCars() {
    }
}
