package co.dpacademy.interactions.teststore;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.dpacademy.userinterface.teststore.ProductoModal.RADIO_COLOR_BLANCO;
import static co.dpacademy.userinterface.teststore.ProductoModal.RADIO_COLOR_NEGRO;

public class SeleccionarColor implements Interaction {

    private String color;

    public SeleccionarColor(String color) {
        this.color = color;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (color.equalsIgnoreCase("blanco")) {
            actor.attemptsTo(
                    Click.on(RADIO_COLOR_BLANCO)
            );
        } else if (color.equalsIgnoreCase("negro")) {
            actor.attemptsTo(
                    Click.on(RADIO_COLOR_NEGRO)
            );
        }
    }

    public  static Performable producto(String color){
        return Tasks.instrumented(SeleccionarColor.class,color);
    }
}
