package models;

public class Vehicle {
    String plateNumber, brand, model;
    int year, unitAmount;
    double price;
    boolean available;

    public Vehicle (String plateNumber, String brand, String model,
                    int year, boolean available, int unitAmount, double price) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.available = available;
        this.unitAmount = unitAmount;
        this.price = price;
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

    public  int getUnitAmount () {
        return unitAmount;
    }

    public  double getPrice () {
        return price;
    }
}
