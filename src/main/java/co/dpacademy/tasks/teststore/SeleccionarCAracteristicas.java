package co.dpacademy.tasks.teststore;

import co.dpacademy.utils.Strings;
import cucumber.api.java.it.Ma;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class SeleccionarCAracteristicas implements Task {

    private Map<String,String> mapCaractiristicas;

    public SeleccionarCAracteristicas(Map<String,String> mapCaractiristicas){
        this.mapCaractiristicas = mapCaractiristicas;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Map.Entry<String,String> caracteristica:mapCaractiristicas.entrySet()) {
            actor.attemptsTo(
                    SeleccionarCaracteristica.de(caracteristica.getKey(), caracteristica.getValue())
            );
        }

    }

    public static  SeleccionarCAracteristicas desde(String caracteristicas){
        Map<String,String> mapCaractiristicas = Strings.parseCaracteristicProducts(caracteristicas);
        return Tasks.instrumented(SeleccionarCAracteristicas.class,mapCaractiristicas);
    }
}
