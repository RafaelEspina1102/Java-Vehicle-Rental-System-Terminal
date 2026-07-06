package models;

public class Customer extends  User{
    private String licenseNumber, phoneNumber;

    public Customer (String name, String username, String password, String licenseNumber, String phoneNumber) {
        super(name, username, password);
        this.licenseNumber = licenseNumber;
        this.phoneNumber = phoneNumber;
    }

    public void rentAVehicle() {

    }

    public void returnAVehicle() {

    }
}
