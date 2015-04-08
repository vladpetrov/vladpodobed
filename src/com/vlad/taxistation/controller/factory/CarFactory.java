package com.vlad.taxistation.controller.factory;

import com.vlad.taxistation.entity.car.*;

/**
 * Created by higgs on 29.03.15.
 */

public final class CarFactory {

    private CarFactory() {
    }

    public static Car getLittleCityCar(String brand, int price, double fuelConsumption, double maxSpeed, double turnRadius) {
        return new LittleCityCar(brand, price, fuelConsumption, maxSpeed, turnRadius);
    }

    public static Car getLuxuryCar(String brand, int price, double fuelConsumption, double maxSpeed, int champagneBottles) {
        return new LuxuryCar(brand, price, fuelConsumption, maxSpeed, champagneBottles);
    }

    public static Car getMinivan(String brand, int price, double fuelConsumption, double maxSpeed, int seatingsCount) {
        return new Minivan(brand, price, fuelConsumption, maxSpeed, seatingsCount);
    }

    public static Car getSportCar(String brand, int price, double fuelConsumption, double maxSpeed, double acceleration) {
        return new SportCar(brand, price, fuelConsumption, maxSpeed, acceleration);
    }

    public static Car getSportLittleCityCar(String brand, int price, double fuelConsumption, double maxSpeed, double turnRadius, double acceleration) {
        return new SportLittleCityCar(brand, price, fuelConsumption, maxSpeed, turnRadius, acceleration);
    }

}
