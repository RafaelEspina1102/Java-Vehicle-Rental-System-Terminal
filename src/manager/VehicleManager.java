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
                     int engineSize, String motorcycleType, int unitAmount, double price) {
        vehicles.add(new Motorcycle(plateNumber, brand, model, year,
                available, engineSize, motorcycleType, unitAmount, price));

    }

    // Truck
    public void addVehicle (String plateNumber, String brand, String model, int year, boolean available,
                            int wheels, int weightLimit, int unitAmount, double price) {
        vehicles.add(new Truck(plateNumber, brand, model, year,
                available, wheels, weightLimit, unitAmount, price));

    }

    // Car
    public void addVehicle (String plateNumber, String brand, String model, int year, boolean available,
                            String carType, int unitAmount, double price) {
        vehicles.add(new Car(plateNumber, brand, model, year,
                available, carType, unitAmount, price));

    }

    void removeVehicle (String plateNumber) {

    }

    public Vehicle findVehicle (Vehicle vehicle) {
        for (Vehicle vehicle1: vehicles) {
            if (vehicle1.equals(vehicle)) {
                return vehicle;
            }
        }

        return null;
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
                System.out.printf("Unit Amount: " + motorcycle.getUnitAmount());
                System.out.printf("Price: " + motorcycle.getPrice());
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
                System.out.printf("Unit Amount: " + truck.getUnitAmount());
                System.out.printf("Price: " + truck.getPrice());
                System.out.println("Available: " + truck.getAvailable());
            }
        }
    }

    public  void listCar () {
        for (Vehicle vehicle: vehicles) {
            if (vehicle instanceof Car car) {
                System.out.println("Brand: " + car.getBrand());
                System.out.println("Model: " + car.getModel());
                System.out.println("Year: " + car.getYear());
                System.out.println("Plate Number: " + car.getPlateNumber());
                System.out.printf("Car Type: " + car.getCarType());
                System.out.printf("Unit Amount: " + car.getUnitAmount());
                System.out.printf("Price: " + car.getPrice());
                System.out.printf("Available: " + car.getAvailable());
            }
        }
    }
}
