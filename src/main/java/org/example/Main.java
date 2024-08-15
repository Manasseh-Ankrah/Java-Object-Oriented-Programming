package org.example;

import org.example.Inheritance.single_level.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Single Level Inheritance!");
        System.out.println("");

        Car mercedes = new Car(300);
        mercedes.openTrunk();
        mercedes.closeTrunk();
        mercedes.getNumberOfDoors(6);

        System.out.println("");
        mercedes.startEngine();
        mercedes.stopEngine();
        System.out.println("Fuel Level is currently at " + mercedes.getFuelLevel());


    }
}