package org.example.cars.Intercface;

import org.example.cars.midsize_cars.PremiumCar;
import org.example.cars.vans.FullSizeVans;

public interface IFullSizeSUVs {
    IFullSizeSUVs setModel(String model);
    IFullSizeSUVs setMake(String make);
    IFullSizeSUVs setYear(int year);
    IFullSizeSUVs setNumber_of_seats(int number_of_seats);
    IFullSizeSUVs setColour(String colour);
    IFullSizeSUVs setPrice(int price);
    IFullSizeSUVs setEngine_displacement(String engine_displacement);
    IFullSizeSUVs setKarkas_weight(int karkas_weight);
    FullSizeVans builld();
}
