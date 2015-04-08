package com.vlad.taxistation.entity.car;

/**
 * Created by higgs on 29.03.15.
 */

public class Minivan extends Car {
    private int seatingsCount;

    public Minivan(String brand, int price, double fuelConsumption, double maxSpeed, int seatingsCount) {
        super(brand, price, fuelConsumption, maxSpeed);
        this.seatingsCount = seatingsCount;
    }

    public int getSeatingsCount() {
        return seatingsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Minivan minivan = (Minivan) o;

        if (seatingsCount != minivan.seatingsCount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + seatingsCount;
        return result;
    }

    @Override
    public String toString() {
        return "Minivan{" +
                "seatingsCount=" + seatingsCount +
                "} " + super.toString();
    }

}
