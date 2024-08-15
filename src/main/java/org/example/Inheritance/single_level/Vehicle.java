package org.example.Inheritance.single_level;

public class Vehicle {
    private int fuelLevel;

    public Vehicle(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void startEngine() {
        System.out.println("Engine started successfully!");
    }

    public void stopEngine() {
        System.out.println("Engine stopped successfully!");
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}
