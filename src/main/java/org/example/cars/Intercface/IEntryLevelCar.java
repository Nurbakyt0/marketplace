package org.example.cars.Intercface;

import org.example.cars.luxury_cars.EntryLevelCar;

public interface IEntryLevelCar {
    IEntryLevelCar setModel(String model);
    IEntryLevelCar setMake(String make);
    IEntryLevelCar setYear(int year);
    IEntryLevelCar setNumber_of_seats(int number_of_seats);
    IEntryLevelCar setColour(String colour);
    IEntryLevelCar setPrice(int price);
    IEntryLevelCar setEngine_displacement(String engine_displacement);
    IEntryLevelCar setPanorama(String panorama);
    EntryLevelCar build();

}
