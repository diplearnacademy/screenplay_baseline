package co.dpacademy.userinterface.teststore;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductoModal  extends PageObject {

    public static  final Target INPUT_CANTIDAD = Target.the("Elegir cantidad de productos")
            .located(By.id("quantity_wanted"));

    public  static  final  Target BOTON_CONTINUAR_COMPRANDO  = Target.the("Continuiar comprando")
            .located(By.xpath("//button[text()='Continue shopping']"));

    public  static  final  Target BOTON_AGREGAR_PRODUCTO = Target.the("Agregar producto")
            .located(By.xpath("//button[@data-button-action='add-to-cart']"));

    public  static  final  Target SELECTOR_TALLA = Target.the("selecionar Talla")
            .located(By.xpath("//select[@data-product-attribute='1']"));

    public static  final  Target SELECTOR_DIMENSIONES = Target.the("seleccionar Dimensiones")
            .located(By.xpath("//select[@data-product-attribute='3']"));

    public static final  Target RADIO_COLOR_NEGRO = Target.the("seleccionar Color negro")
            .located(By.xpath("//input[@class='input-color' and @value='8']"));

    public static final  Target RADIO_COLOR_BLANCO = Target.the("seleccionar Color blanco")
            .located(By.xpath("//input[@class='input-color' and @value='11']"));

}
