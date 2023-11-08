package co.dpacademy.stepdefinitions;

import co.dpacademy.interactions.Abrir;
import co.dpacademy.question.AutenticacionEcommerce;
import co.dpacademy.tasks.Autenticacion;
import co.dpacademy.userinterface.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginSauceDemoStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

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
