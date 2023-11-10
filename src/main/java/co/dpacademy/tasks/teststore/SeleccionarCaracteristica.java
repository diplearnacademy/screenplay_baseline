package co.dpacademy.tasks.teststore;

import co.dpacademy.interactions.teststore.SeleccionarColor;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.actions.*;

import static co.dpacademy.userinterface.teststore.ProductoModal.SELECTOR_DIMENSIONES;
import static co.dpacademy.userinterface.teststore.ProductoModal.SELECTOR_TALLA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SeleccionarCaracteristica implements Task {

    private  String caracteristica;
    private  String valor;

    public SeleccionarCaracteristica(String caracteristica,String valor){
        this.caracteristica = caracteristica;
        this.valor = valor;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("caracteristica " + caracteristica);
        switch (caracteristica.toLowerCase()){
            case "talla":
                actor.attemptsTo(
                        WaitUntil.the(SELECTOR_TALLA,isVisible()),
                        SelectFromOptions.byVisibleText(valor).from(SELECTOR_TALLA)
                );
                break;
            case "dimension":
                actor.attemptsTo(
                        WaitUntil.the(SELECTOR_DIMENSIONES,isVisible()),
                        SelectFromOptions.byVisibleText(valor).from(SELECTOR_DIMENSIONES)
                );
                break;
            case "color":
                actor.attemptsTo(
                        SeleccionarColor.producto(valor)
                );
                break;
            default:
                throw  new IllegalArgumentException("opcion no valida");
        }
    }

    public  static  SeleccionarCaracteristica de(String caracteristica,String valor){

        return Tasks.instrumented(SeleccionarCaracteristica.class,caracteristica,valor);
    }
}
