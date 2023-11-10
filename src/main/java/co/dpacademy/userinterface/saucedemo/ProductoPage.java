package co.dpacademy.userinterface.saucedemo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductoPage extends PageObject {

    public static final Target LABEL_TITULO_PAGINA = Target.the("Titulo  de la pagina de productos")
            .located(By.xpath("//span[contains(.,'Products')]"));
}
