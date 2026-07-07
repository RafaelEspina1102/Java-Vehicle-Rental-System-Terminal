package models;

public class Vehicle {
    String plateNumber, brand, model;
    int year;
    boolean available;

    public Vehicle (String plateNumber, String brand, String model,
                    int year, boolean available) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.available = available;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public boolean getAvailable () {
        return available;
    }
}
