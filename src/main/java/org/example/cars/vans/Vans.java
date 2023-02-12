package org.example.cars.vans;

import jakarta.persistence.MappedSuperclass;
import org.example.cars.Car;

@MappedSuperclass
abstract public class Vans extends Car {
    protected String captain_seat;
    public Vans(String make,int price, String model,int year, int number_of_seats,String colour,String engine_displacement,String captain_seat){
        super(make,price,model,year,number_of_seats,colour,engine_displacement);
        this.captain_seat=captain_seat;
    }

    public String getCaptain_seat() {
        return captain_seat;
    }

    public void setCaptain_seat(String captain_seat) {
        this.captain_seat = captain_seat;
    }

    public Vans() {

    }
}
