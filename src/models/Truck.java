package models;

public class Truck extends Vehicle {

    private int wheels, weightLimit;

    public Truck (String plateNumber, String brand, String model,
                       int year, boolean available, int wheels, int weightLimit,
                  int unitAmount, double price) {
        super(plateNumber, brand, model, year, available, unitAmount, price);
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
