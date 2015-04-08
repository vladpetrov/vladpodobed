package com.vlad.taxistation.entity.car;

/**
 * Created by higgs on 29.03.15.
 */

public class LittleCityCar extends Car {
    private double turnRadius;

    public LittleCityCar(String brand, int price, double fuelConsumption, double maxSpeed, double turnRadius) {
        super(brand, price, fuelConsumption, maxSpeed);
        this.turnRadius = turnRadius;
    }

    public double getTurnRadius() {
        return turnRadius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LittleCityCar that = (LittleCityCar) o;

        if (Double.compare(that.turnRadius, turnRadius) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(turnRadius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "LittleCityCar{" +
                "turnRadius=" + turnRadius +
                "} " + super.toString();
    }

}
