package co.dpacademy.stepdefinitions;

import co.dpacademy.interactions.teststore.Abrir;
import co.dpacademy.question.teststore.ProductosEnCarrito;
import co.dpacademy.tasks.teststore.AgregarProductos;
import co.dpacademy.userinterface.teststore.HomePage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

import static co.dpacademy.userinterface.teststore.HomePage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionarProductoStepDefinition {

    private List<Map<String,String>> listaProductos;

    @Dado("Que {word} esta en la pagina de teststore")
    public void queBryanEstaEnLaPaginaDeTeststore(String nombre) {
        theActorCalled(nombre).wasAbleTo(
                Abrir.laTestStore()
        );
    }

    @Cuando("Agregar los productos con sus caracteristicas al carrito")
    public void agregarLosProductosConSusCaracteristicasAlCarrito(List<Map<String,String>> productos) throws InterruptedException {
        listaProductos = productos;
        theActorInTheSpotlight().attemptsTo(
                AgregarProductos.alCarritoDeCompras(productos)
        );
     Thread.sleep(10000);
    }

    @Entonces("verifa que los productos fueron agregados al carrito")
    public void verifaQueLosProductosFueronAgregadosAlCarrito() {
        /*for (Map<String,String> producto:listaProductos) {
            theActorInTheSpotlight().attemptsTo(
                    Ensure.that(PRODUCTO.of(producto.get("Producto"))).isDisplayed()
            );
        }*/

        listaProductos.forEach(
                producto -> theActorInTheSpotlight().attemptsTo(
                        Ensure.that(PRODUCTO.of(producto.get("Producto"))).isDisplayed()
                )
        );

       // theActorInTheSpotlight().should(GivenWhenThen.seeThat(ProductosEnCarrito.sonVisibles(listaProductos)));

    }
}
