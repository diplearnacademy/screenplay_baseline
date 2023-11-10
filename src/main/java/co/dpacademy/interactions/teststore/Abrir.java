package co.dpacademy.interactions.teststore;

import co.dpacademy.userinterface.teststore.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(HomePage.class)
        );
    }

    public  static Performable laTestStore(){
        return   Tasks.instrumented(Abrir.class);
    }
}
