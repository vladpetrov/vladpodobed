package com.vlad.taxistation.run;

import com.vlad.taxistation.controller.TaxiStationManager;
import com.vlad.taxistation.controller.factory.CarFactory;
import com.vlad.taxistation.entity.car.Car;
import com.vlad.taxistation.entity.taxiStation.TaxiStation;

import java.util.List;

/**
 * Created by higgs on 29.03.15.
 */

public class Main {
    public static void main(String[] args) {
        TaxiStation taxiStation = new TaxiStation();
        TaxiStationManager manager = TaxiStationManager.getInstance();

        try {
            manager.addCar(taxiStation, CarFactory.getLuxuryCar("Audi", 100000, 10.0, 250.7, 8));
            manager.addCar(taxiStation, CarFactory.getLuxuryCar("BMW", 110000, 11.0, 260.0, 7));

            manager.addCar(taxiStation, CarFactory.getSportCar("BMW", 150000, 15.0, 300.7, 4.2));
            manager.addCar(taxiStation, CarFactory.getSportCar("Audi", 1200000, 16.0, 290.7, 4.0));

            manager.addCar(taxiStation, CarFactory.getLittleCityCar("Mini", 20000, 8.0, 210.7, 5.5));
            manager.addCar(taxiStation, CarFactory.getSportLittleCityCar("Smart", 40000, 9.0, 250.7, 6.2, 6.1));

            for (Car car : taxiStation.getCars()) {
                System.out.println(car.toString());
            }

            System.out.println("\n\n");

            manager.sortStationByFuelConsumption(taxiStation);

            for (Car car : taxiStation.getCars()) {
                System.out.println(car.toString());
            }

            System.out.println("\n\n");

            List<Car> cars = manager.getCarByMaxSpeedRange(taxiStation, 280.0, 350.0);

            for (Car car : cars) {
                System.out.println(car.toString());
            }

            manager.addCar(taxiStation, CarFactory.getSportLittleCityCar("Audi", 80000, 10.0, 280.0, 5.2, 5.1));

            System.out.println("\n\n");

            for (Car car : taxiStation.getCars()) {
                System.out.println(car.toString());
            }

            System.out.println("\n\n");

            System.out.println("Taxi station cost: " + manager.getTaxiStationCost(taxiStation));

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

}
