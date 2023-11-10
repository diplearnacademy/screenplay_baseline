package co.dpacademy.tasks.teststore;

import co.dpacademy.userinterface.teststore.HomePage;
import com.gargoylesoftware.htmlunit.javascript.host.Notification;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.dpacademy.userinterface.teststore.HomePage.*;
import static co.dpacademy.userinterface.teststore.ProductoModal.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AgregarProductos implements Task {

    List<Map<String, String>> listaProductos;

    public AgregarProductos(List<Map<String, String>> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (Map<String, String> producto : listaProductos) {
            actor.attemptsTo(
                    WaitUntil.the(PRODUCTO.of(producto.get("Producto")), isVisible()),
                    MoveMouse.to(PRODUCTO.of(producto.get("Producto"))),
                    WaitUntil.the(LINK_PRODUCTO.of(producto.get("Producto")), isVisible()),
                    JavaScriptClick.on(LINK_PRODUCTO.of(producto.get("Producto"))),
                    Clear.field(INPUT_CANTIDAD),
                    Enter.theValue(producto.get("Cantidad")).into(INPUT_CANTIDAD),
                    SeleccionarCAracteristicas.desde(producto.get("caracteristicas")),
                    WaitUntil.the(BOTON_AGREGAR_PRODUCTO,isClickable()),
                    Click.on(BOTON_AGREGAR_PRODUCTO),
                    WaitUntil.the(BOTON_CONTINUAR_COMPRANDO,isClickable()),
                    Click.on(BOTON_CONTINUAR_COMPRANDO)
            );
        }
        actor.attemptsTo(
                WaitUntil.the(BOTON_CARRITO_COMPRAS,isVisible()),
                Click.on(BOTON_CARRITO_COMPRAS)
        );


    }

    public  static AgregarProductos alCarritoDeCompras(List<Map<String,String>> listaProductos){
        return Tasks.instrumented(AgregarProductos.class,listaProductos);
    }
}
