package manager;

import models.Customer;
import models.Employee;
import models.User;

import java.util.ArrayList;

public class UserManager {
    private String username, password, name, employeeID, licenseNumber, phoneNumber;

    private ArrayList<User> users = new ArrayList<>();

    // Create account for employee
    public void createAccount (String name, String username, String password, String employeeID) {
        users.add(new Employee(name, username, password, employeeID));
    }

    // Create account for customer
    public void createAccount (String name, String username, String password,
                               String licenseNumber, String phoneNumber) {
        users.add(new Customer(name, username, password, licenseNumber, phoneNumber));
    }


}
