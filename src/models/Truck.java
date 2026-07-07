package models;

public class Truck extends Vehicle {

    private int wheels, weightLimit;

    public Truck (String plateNumber, String brand, String model,
                       int year, boolean available, int wheels, int weightLimit) {
        super(plateNumber, brand, model, year, available);
        this.wheels = wheels;
        this.weightLimit = weightLimit;

    }

    public int getWheels () {
        return wheels;
    }

    public int getWeightLimit () {
        return weightLimit;
    }

}
