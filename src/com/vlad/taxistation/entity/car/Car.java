package com.vlad.taxistation.entity.car;

/**
 * Created by higgs on 29.03.15.
 */

public abstract class Car {
    private String brand;
    private int price;
    private double fuelConsumption;
    private double maxSpeed;

    public Car(String brand, int price, double fuelConsumption, double maxSpeed) {
        this.brand = brand;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.fuelConsumption, fuelConsumption) != 0) return false;
        if (Double.compare(car.maxSpeed, maxSpeed) != 0) return false;
        if (price != car.price) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + price;
        temp = Double.doubleToLongBits(fuelConsumption);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}
