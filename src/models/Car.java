package models;

public class Car extends Vehicle {

    private String carType;

    public Car (String plateNumber, String brand, String model,
                       int year, boolean available, String carType) {
        super(plateNumber, brand, model, year, available);
        this.carType = carType;

    }

}
