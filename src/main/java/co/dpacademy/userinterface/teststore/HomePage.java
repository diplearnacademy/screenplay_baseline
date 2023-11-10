package co.dpacademy.userinterface.teststore;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://teststore.automationtesting.co.uk/")
public class HomePage extends PageObject {

    public  static  final Target PRODUCTO = Target.the("Producto a seleccionar")
            .locatedBy("//a[contains(.,'{0}')]");

    public static  final  Target LINK_PRODUCTO = Target.the("Link del producto")
            .locatedBy("//a[contains(.,'{0}')]/../..//following-sibling::div//i");

    public  static  final  Target BOTON_CARRITO_COMPRAS = Target.the("Abrir carrito de compras")
            .located(By.xpath("//i[text()='shopping_cart']/."));



}
