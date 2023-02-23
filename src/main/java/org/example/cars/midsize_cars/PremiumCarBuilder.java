package org.example.cars.midsize_cars;

import org.example.cars.Intercface.IPremiumCar;

public class PremiumCarBuilder implements IPremiumCar {
    PremiumCar premiumCar = new PremiumCar();

    @Override
    public IPremiumCar setModel(String model) {
        premiumCar.setModel(model);
        return this;
    }

    @Override
    public IPremiumCar setMake(String make) {
        premiumCar.setMake(make);
        return this;
    }

    @Override
    public IPremiumCar setYear(int year) {
        premiumCar.setYear(year);
        return this;
    }

    @Override
    public IPremiumCar setNumber_of_seats(int number_of_seats) {
        premiumCar.setNumber_of_seats(number_of_seats);
        return this;
    }

    @Override
    public IPremiumCar setColour(String colour) {
        premiumCar.setColour(colour);
        return this;
    }

    @Override
    public IPremiumCar setPrice(int price) {
        premiumCar.setPrice(price);
        return this;
    }

    @Override
    public IPremiumCar setEngine_displacement(String engine_displacement) {
        premiumCar.setEngine_displacement(engine_displacement);
        return this;
    }

    @Override
    public IPremiumCar setPassenger_space(int passenger_space) {
        premiumCar.setPassenger_space(passenger_space);
        return this;
    }

    @Override
    public PremiumCar builld() {
        return premiumCar;
    }
}
