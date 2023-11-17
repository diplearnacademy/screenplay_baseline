package co.dpacademy.stepdefinitions;

import co.dpacademy.exceptions.TituloHomeNoEsVisibleException;
import co.dpacademy.interactions.saucedemo.Abrir;
import co.dpacademy.question.AutenticacionEcommerce;
import co.dpacademy.tasks.saucedemo.Autenticacion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

import static co.dpacademy.exceptions.TituloHomeNoEsVisibleException.MENSAJE_EXCEPCION_TITULO_NO_VISIBLE;
import static co.dpacademy.models.builders.UserBuilder.con;
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

    @Cuando("el ingresa sus credenciales de usuario habilitado")
    public void elIngresaSusCredencialesHabilitado() {
        theActorInTheSpotlight()
                .attemptsTo(
                        Autenticacion.enSaucedemo(
                                con()
                                        .usuarioHabilitado()));
    }

    @Cuando("el ingresa sus credenciales de usuario bloqueado")
    public void elIngresaSusCredencialesBloqueado() {
        theActorInTheSpotlight().attemptsTo(Autenticacion.enSaucedemo(con().usuarioBloqueado()));
    }

    @Cuando("el ingresa sus credenciales")
    public void elIngresaSusCredenciales(List<Map<String, String>> credentials) {
        theActorInTheSpotlight()
                .attemptsTo(
                        Autenticacion.enSaucedemo(
                                con()
                                        .conUsuarioExitoso(credentials.get(0).get("username"))));
    }

    @Cuando("el ingresa sus credenciales de usuario con errores")
    public void elIngresaSusCredencialesError() {
        theActorInTheSpotlight().attemptsTo(Autenticacion.enSaucedemo(con().usuarioConError()));
    }

    @Entonces("el usuario deberia ingresar a la pagina {word}")
    public void elUsuarioDeberiaIngresarALaPaginaProductos(String nombrePagina) {
       theActorInTheSpotlight()
               .should(seeThat(
                       AutenticacionEcommerce.esExitosa(nombrePagina))
                       .orComplainWith(TituloHomeNoEsVisibleException.class, MENSAJE_EXCEPCION_TITULO_NO_VISIBLE)
               );
    }
}
