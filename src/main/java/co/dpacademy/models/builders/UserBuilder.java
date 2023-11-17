package co.dpacademy.models.builders;

import co.dpacademy.models.User;
import co.dpacademy.utils.Builder;

public class UserBuilder implements Builder<User> {

    private String username;
    private String password;

    public static UserBuilder con() {
        return new UserBuilder();
    }

    public UserBuilder usuarioHabilitado() {
        this.username = "standard_user";
        this.password = "secret_sauce";
        return this;
    }

    public UserBuilder usuarioBloqueado() {
        this.username = "locked_out_user";
        this.password = "secret_sauce";
        return this;
    }

    public UserBuilder usuarioConError() {
        this.username = "error_user";
        this.password = "secret_sauce";
        return this;
    }

/*
    public UserBuilder usandoSuClave() {
        this.password = "secret_sauce";
        return this;
    }
*/

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public User build() {
        return new User(this);
    }
}
