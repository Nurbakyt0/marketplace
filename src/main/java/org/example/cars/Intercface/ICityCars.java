package org.example.cars.Intercface;

import org.example.cars.compact_cars.CityCars;

public interface ICityCars {

    ICityCars setModel(String model);
    ICityCars setMake(String make);
    ICityCars setYear(int year);
    ICityCars setNumber_of_seats(int number_of_seats);
    ICityCars setColour(String colour);
    ICityCars setPrice(int price);
    ICityCars setEngine_displacement(String engine_displacement);
    ICityCars setDovodchik(String dovodchik);
    CityCars build();

}
