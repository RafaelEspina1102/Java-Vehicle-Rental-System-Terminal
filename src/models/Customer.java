package models;

public class Customer extends  User{
    private String licenseNumber, phoneNumber;

    public Customer (String name, String username, String password, String licenseNumber, String phoneNumber) {
        super(name, username, password);
        this.licenseNumber = licenseNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getLicenseNumber () {
        return licenseNumber;
    }

    public String getPhoneNumber () {
        return licenseNumber;
    }

    public void rentAVehicle(Vehicle vehicle) {

    }

    public void returnAVehicle() {

    }
}
