package co.dpacademy.question.teststore;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import java.util.Map;

import static co.dpacademy.userinterface.teststore.HomePage.PRODUCTO;


public class ProductosEnCarrito implements Question<Boolean> {

    private List<Map<String,String>> productos;

    public ProductosEnCarrito(List<Map<String,String>> producto){
        this.productos = producto;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        for (Map<String, String> producto : productos) {
            if (!PRODUCTO.of(producto.get("Producto")).resolveFor(actor).isDisplayed()) {
                return false;
            }
        }
        return true;

        //otra forma de implementarlar el ciclo y la validacion
        /*return productos.stream()
                .allMatch(producto -> PRODUCTO.of(producto.get("Producto")).resolveFor(actor).isDisabled());*/
    }

    public static Question<Boolean> sonVisibles(List<Map<String, String>> productos) {
        return new ProductosEnCarrito(productos);
    }
}
