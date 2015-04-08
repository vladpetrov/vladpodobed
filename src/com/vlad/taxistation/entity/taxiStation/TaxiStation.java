package com.vlad.taxistation.entity.taxiStation;

import com.vlad.taxistation.entity.car.Car;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by higgs on 29.03.15.
 */

public class TaxiStation {
    private List<Car> cars = new LinkedList<Car>();

    public void addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Argument shouldn't be null");
        }
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getStationCost() {
        int cost = 0;
        for (Car car : this.getCars()) {
            cost += car.getPrice();
        }
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxiStation that = (TaxiStation) o;

        if (cars != null ? !cars.equals(that.cars) : that.cars != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return cars != null ? cars.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "TaxiStation{" +
                "cars=" + cars +
                '}';
    }

}
