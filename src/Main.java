import manager.UserManager;
import models.Employee;
import models.User;

public class Main {
    static public void main(String[] args) {

        UserManager userManager = new UserManager();
        userManager.testing();

        User currentUser;

        currentUser = userManager.login("raffy", "123");
        if (userManager.checkEmployee(currentUser)) {
            System.out.println(currentUser.getName());

        }
        else {
            System.out.println("This is not an employee");
        }
    }
}
