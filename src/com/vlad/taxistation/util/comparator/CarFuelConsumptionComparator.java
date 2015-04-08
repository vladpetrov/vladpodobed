package com.vlad.taxistation.util.comparator;

import com.vlad.taxistation.entity.car.Car;

import java.util.Comparator;

/**
 * Created by higgs on 29.03.15.
 */

public class CarFuelConsumptionComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        double cons1 = o1.getFuelConsumption();
        double cons2 = o2.getFuelConsumption();

        if (cons1 > cons2) {
            return 1;
        } else if (cons1 < cons2) {
            return -1;
        } else {
            return 0;
        }
    }

}
