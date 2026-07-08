package models;

public class Car extends Vehicle {

    private String carType;

    public Car (String plateNumber, String brand, String model, int year,
                boolean available, String carType, int unitAmount, double price) {
        super(plateNumber, brand, model, year, available, unitAmount, price);
        this.carType = carType;

    }

    public String getCarType () {
        return carType;
    }

}
