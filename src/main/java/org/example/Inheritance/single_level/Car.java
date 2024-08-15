package org.example.Inheritance.single_level;

public class Car extends Vehicle {

    public Car(Integer fuelLevel) {
        super(fuelLevel);
    }


    public void openTrunk() {
        System.out.println("Trunk opened successfully!");
    }
    public void closeTrunk() {
        System.out.println("Trunk closed successfully!");
    }
    public void getNumberOfDoors(Integer numberOfDoors) {
        System.out.println( "The total number of doors are " + numberOfDoors);
    }
}
