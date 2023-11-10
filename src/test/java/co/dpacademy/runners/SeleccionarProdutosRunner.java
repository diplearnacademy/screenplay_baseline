package co.dpacademy.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/selecionar_productos.feature",
        glue = "co.dpacademy.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class SeleccionarProdutosRunner {
}
