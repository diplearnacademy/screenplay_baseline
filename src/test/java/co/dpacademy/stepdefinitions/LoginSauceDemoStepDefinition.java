package co.dpacademy.stepdefinitions;

import co.dpacademy.interactions.saucedemo.Abrir;
import co.dpacademy.question.AutenticacionEcommerce;
import co.dpacademy.tasks.saucedemo.Autenticacion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginSauceDemoStepDefinition {


    @Dado("que {word} se encuentra en la pagina")
    public void queBryanSeEncuentraEnLaPagina(String nombre) {
        theActorCalled(nombre).wasAbleTo(
                Abrir.elNavegador()
        );
        //theActorCalled(nombre).wasAbleTo(Open.browserOn().thePageNamed("webdriver.base.url"));
       // theActorCalled(nombre).wasAbleTo(Open.browserOn().the(LoginPage.class));
    }

    @Cuando("el ingresa sus credenciales")
    public void elIngresaSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(Autenticacion.enSaucedemo());
    }

    @Entonces("el usuario deberia ingresar a la pagina {word}")
    public void elUsuarioDeberiaIngresarALaPaginaProductos(String nombrePagina) {
       theActorInTheSpotlight().should(seeThat(AutenticacionEcommerce.esExitosa(nombrePagina)));
    }
}
