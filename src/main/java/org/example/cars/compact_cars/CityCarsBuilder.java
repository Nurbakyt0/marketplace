package org.example.cars.compact_cars;

import org.example.cars.Intercface.ICityCars;

public class CityCarsBuilder implements ICityCars {

    CityCars cityCars = new CityCars();

    @Override
    public ICityCars setModel(String model) {
        cityCars.setModel(model);
        return this;
    }

    @Override
    public ICityCars setMake(String make)  {
        cityCars.setMake(make);
        return this;
    }

    @Override
    public ICityCars setYear(int year) {
        cityCars.setYear(year);
        return this;
    }

    @Override
    public ICityCars setNumber_of_seats(int number_of_seats) {
        cityCars.setNumber_of_seats(number_of_seats);
        return this;
    }

    @Override
    public ICityCars setColour(String colour) {
        cityCars.setColour(colour);
        return this;
    }

    @Override
    public ICityCars setPrice(int price) {
        cityCars.setPrice(price);
        return this;
    }

    @Override
    public ICityCars setEngine_displacement(String engine_displacement) {
        cityCars.setEngine_displacement(engine_displacement);
        return this;
    }

    @Override
    public ICityCars setDovodchik(String dovodchik) {
        cityCars.setDovodchik(dovodchik);
        return this;
    }

    @Override
    public CityCars build() {
        return cityCars;
    }
}
