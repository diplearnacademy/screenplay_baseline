package co.dpacademy.interactions;

import co.dpacademy.userinterface.LoginPage;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Interaction {

    private LoginPage loginPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(loginPage));
    }

    public static Performable elNavegador(){
        return  Tasks.instrumented(Abrir.class);
    }


}
