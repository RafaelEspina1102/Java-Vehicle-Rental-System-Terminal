package models;

public class User {
    private String name, username, password;

    public User (String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName () {
        return name;
    }

    public String getUsername () {
        return username;
    }

    public boolean checkPassword (String password) {
        return password.equals(this.password);
    }

}
