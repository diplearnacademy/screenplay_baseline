package co.dpacademy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    public static final Target INPUT_USUARIO = Target.the("Campo de ingreso usuario").
            located(By.id("user-name"));

    public static final  Target INPUT_PASSWORD = Target.the("Campo ingreso password").
            located(By.xpath("//input[@data-test='password']"));

    public  static final  Target BOTON_LOGIN = Target.the("Boton inicio Session").located(By.name("login-button"));

}
