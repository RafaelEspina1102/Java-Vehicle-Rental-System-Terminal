package models;

public class Employee extends User{
    private String employeeID;

    public Employee (String name, String username, String password, String employeeID) {
        super(name, username, password);
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }


}
