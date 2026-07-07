package manager;

import models.Car;
import models.Motorcycle;
import models.Truck;
import models.Vehicle;

import java.util.ArrayList;

public class VehicleManager {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    // Motorcycle
    public void addVehicle (String plateNumber, String brand, String model, int year, boolean available,
                     int engineSize, String motorcycleType) {
        vehicles.add(new Motorcycle(plateNumber, brand, model, year,
                available, engineSize, motorcycleType));

    }

    // Truck
    public void addVehicle (String plateNumber, String brand, String model, int year, boolean available,
                            int wheels, int weightLimit) {
        vehicles.add(new Truck(plateNumber, brand, model, year,
                available, wheels, weightLimit));

    }

    // Car
    public void addVehicle (String plateNumber, String brand, String model, int year, boolean available,
                            String carType) {
        vehicles.add(new Car(plateNumber, brand, model, year,
                available, carType));

    }

    void removeVehicle (String plateNumber) {

    }

    void findVehicle () {

    }


    public void listMotorcycle () {
        for (Vehicle vehicle: vehicles) {
            if (vehicle instanceof Motorcycle motorcycle) {
                System.out.println("Brand: " + motorcycle.getBrand());
                System.out.println("Model: " + motorcycle.getModel());
                System.out.println("Year: " + motorcycle.getYear());
                System.out.println("Plate Number: " + motorcycle.getPlateNumber());
                System.out.println("Engine Size: " + motorcycle.getEngineSize());
                System.out.println("Motorcycle Type: " + motorcycle.getMotorcycleType());
                System.out.println("Available: " + motorcycle.getAvailable());
            }
        }
    }

    public  void listTruck () {
        for (Vehicle vehicle: vehicles) {
            if (vehicle instanceof Truck truck) {
                System.out.println("Brand: " + truck.getBrand());
                System.out.println("Model: " + truck.getModel());
                System.out.println("Year: " + truck.getYear());
                System.out.println("Plate Number: " + truck.getPlateNumber());
                System.out.println("Wheels: " + truck.getWheels());
                System.out.println("Weight Limit: " + truck.getWeightLimit());
                System.out.println("Available: " + truck.getAvailable());
            }
        }
    }

    public  void listCar () {

    }
}
