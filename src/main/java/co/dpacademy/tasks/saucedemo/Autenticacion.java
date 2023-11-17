package co.dpacademy.tasks.saucedemo;

import co.dpacademy.models.User;
import co.dpacademy.models.builders.UserBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.dpacademy.userinterface.saucedemo.LoginPage.*;

public class Autenticacion implements Task {

    private User user;

    public Autenticacion(User user){
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getUsername()).into(INPUT_USUARIO),
                Type.theValue(user.getPassword()).into(INPUT_PASSWORD),
                Click.on(BOTON_LOGIN)
        );
    }

    public  static Autenticacion enSaucedemo(UserBuilder user){
        return Tasks.instrumented(Autenticacion.class, user.build());
    }
}
