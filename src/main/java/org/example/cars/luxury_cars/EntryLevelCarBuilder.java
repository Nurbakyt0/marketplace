package org.example.cars.luxury_cars;

import org.example.cars.Intercface.ICityCars;
import org.example.cars.Intercface.IEntryLevelCar;

import javax.swing.plaf.IconUIResource;
import java.security.KeyStore;
import java.util.logging.Level;

public class EntryLevelCarBuilder implements IEntryLevelCar {
    EntryLevelCar entryLevelCar = new EntryLevelCar();

    @Override
    public IEntryLevelCar setModel(String model) {
        entryLevelCar.setModel(model);
        return this;
    }
    @Override
    public IEntryLevelCar setMake(String make) {
        entryLevelCar.setMake(make);
        return this;
    }

    @Override
    public IEntryLevelCar setYear(int year) {
        entryLevelCar.setYear(year);
        return this;
    }

    @Override
    public IEntryLevelCar setNumber_of_seats(int number_of_seats) {
        entryLevelCar.setNumber_of_seats(number_of_seats);
        return this;
    }

    @Override
    public IEntryLevelCar setColour(String colour) {
        entryLevelCar.setColour(colour);
        return this;
    }

    @Override
    public IEntryLevelCar setPrice(int price) {
        entryLevelCar.setPrice(price);
        return this;
    }

    @Override
    public IEntryLevelCar setEngine_displacement(String engine_displacement) {
        entryLevelCar.setEngine_displacement(engine_displacement);
        return this;
    }

    @Override
    public IEntryLevelCar setPanorama(String panorama) {
        entryLevelCar.setPanorama(panorama);
        return this;
    }

    @Override
    public EntryLevelCar build() {
        return entryLevelCar;
    }

}
