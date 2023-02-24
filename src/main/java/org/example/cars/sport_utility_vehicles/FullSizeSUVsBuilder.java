package org.example.cars.sport_utility_vehicles;

import org.example.cars.Intercface.IFullSizeSUVs;
import org.example.cars.vans.FullSizeVans;

public class FullSizeSUVsBuilder implements IFullSizeSUVs {
    FullSizeVans fullSizeVans = new FullSizeVans();

    @Override
    public IFullSizeSUVs setModel(String model) {
        return this;
    }

    @Override
    public IFullSizeSUVs setMake(String make) {
        return this;
    }

    @Override
    public IFullSizeSUVs setYear(int year) {
        return this;
    }

    @Override
    public IFullSizeSUVs setNumber_of_seats(int number_of_seats) {
        return this;
    }

    @Override
    public IFullSizeSUVs setColour(String colour) {
        return this;
    }

    @Override
    public IFullSizeSUVs setPrice(int price) {
        return this;
    }

    @Override
    public IFullSizeSUVs setEngine_displacement(String engine_displacement) {
        return this;
    }

    @Override
    public IFullSizeSUVs setKarkas_weight(int karkas_weight) {
        return this;
    }

    @Override
    public FullSizeVans build() {
        return fullSizeVans;
    }
}
