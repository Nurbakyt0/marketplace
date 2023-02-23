package org.example.cars.Intercface;

import org.example.cars.midsize_cars.PremiumCar;

public interface IPremiumCar {

    IPremiumCar setModel(String model);
    IPremiumCar setMake(String make);
    IPremiumCar setYear(int year);
    IPremiumCar setNumber_of_seats(int number_of_seats);
    IPremiumCar setColour(String colour);
    IPremiumCar setPrice(int price);
    IPremiumCar setEngine_displacement(String engine_displacement);
    IPremiumCar setPassenger_space(int passenger_space);
    PremiumCar builld();


}
