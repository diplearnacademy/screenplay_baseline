package co.dpacademy.models;

import co.dpacademy.models.builders.UserBuilder;

public class User {
    private String username;
    private String password;

    public User(UserBuilder userBuilder) {
        this.username = userBuilder.getUsername();
        this.password = userBuilder.getPassword();
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
