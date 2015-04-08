package com.vlad.taxistation.util;

import com.vlad.taxistation.entity.car.Car;
import com.vlad.taxistation.entity.taxiStation.TaxiStation;
import com.vlad.taxistation.util.comparator.CarFuelConsumptionComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by higgs on 29.03.15.
 */

public final class CarUtility {
    private static final Comparator carFuelConsumptionComparator = new CarFuelConsumptionComparator();

    public static List<Car> getByMaxSpeedRange(TaxiStation station, double min, double max) {
        List<Car> rankedCars = new LinkedList<Car>();

        for (Car car : station.getCars()) {
            double maxSpeed = car.getMaxSpeed();

            if (maxSpeed >= min && maxSpeed <= max) {
                rankedCars.add(car);
            }
        }
        return rankedCars;
    }

    public static void sortCarsByFuelConsumption(TaxiStation station) {
        Collections.sort(station.getCars(), carFuelConsumptionComparator);
    }

}
