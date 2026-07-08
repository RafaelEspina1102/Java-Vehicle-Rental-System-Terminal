package models;

public class Motorcycle extends Vehicle {

    private int engineSize;
    private String motorcycleType;

    public Motorcycle (String plateNumber, String brand, String model,
                       int year, boolean available, int engineSize, String motorcycleType,
                       int unitAmount, double price) {
        super(plateNumber, brand, model, year, available, unitAmount, price);
        this.engineSize = engineSize;
        this. motorcycleType = motorcycleType;

    }

    public int getEngineSize () {
        return engineSize;
    }

    public String getMotorcycleType () {
        return motorcycleType;
    }
}
