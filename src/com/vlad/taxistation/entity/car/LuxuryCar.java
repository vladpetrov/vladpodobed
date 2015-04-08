package com.vlad.taxistation.entity.car;

/**
 * Created by higgs on 29.03.15.
 */

public class LuxuryCar extends Car {
    private int champagneBottles;

    public LuxuryCar(String brand, int price, double fuelConsumption, double maxSpeed, int champagneBottles) {
        super(brand, price, fuelConsumption, maxSpeed);
        this.champagneBottles = champagneBottles;
    }

    public int getChampagneBottles() {
        return champagneBottles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LuxuryCar luxuryCar = (LuxuryCar) o;

        if (champagneBottles != luxuryCar.champagneBottles) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + champagneBottles;
        return result;
    }

    @Override
    public String toString() {
        return "LuxuryCar{" +
                "champagneBottles=" + champagneBottles +
                "} " + super.toString();
    }

}
