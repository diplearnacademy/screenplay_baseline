package co.dpacademy.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.dpacademy.userinterface.ProductoPage.*;

public class AutenticacionEcommerce implements Question<Boolean> {

    private  String nombrePagina;

    public AutenticacionEcommerce(String nombrePagina){
        this.nombrePagina = nombrePagina;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return  nombrePagina.equalsIgnoreCase(LABEL_TITULO_PAGINA.resolveFor(actor).getText());
    }

    public static  AutenticacionEcommerce esExitosa(String nombrePagina){
        return new AutenticacionEcommerce(nombrePagina);

    }
}
