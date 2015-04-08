package com.vlad.taxistation.controller;

import com.vlad.taxistation.entity.car.Car;
import com.vlad.taxistation.entity.taxiStation.TaxiStation;
import com.vlad.taxistation.util.CarUtility;

import java.util.List;

/**
 * Created by higgs on 29.03.15.
 */

public class TaxiStationManager {
    private static final TaxiStationManager INSTANCE = new TaxiStationManager();

    private TaxiStationManager() {
    }

    public static TaxiStationManager getInstance() {
        return INSTANCE;
    }

    public void sortStationByFuelConsumption(TaxiStation station) {
        if (station == null) {
            throw new IllegalArgumentException("Method's argument shouldn't to be null");
        }
        CarUtility.sortCarsByFuelConsumption(station);
    }

    public List<Car> getCarByMaxSpeedRange(TaxiStation station, double min, double max) {
        if (station == null) {
            throw new IllegalArgumentException("Method's arguments shouldn't be null");
        }
        if (min <= max) {
            return CarUtility.getByMaxSpeedRange(station, min, max);
        }
        throw new IllegalArgumentException("First border shouldn't be greater than second");
    }

    public int getTaxiStationCost(TaxiStation station) {
        return station.getStationCost();
    }

    public void addCar(TaxiStation station, Car car) {
        if (car == null) {
            throw new IllegalArgumentException("car-parameter shouldn't be null");
        }
        station.getCars().add(car);
    }

}
