package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;

//@RunWith(CucumberWithSerenity.class)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(publish = true,
        features = {"src/test/resources/features/"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"stepDefinitions"},
//        tags = "@pagoSinLoginTarjeta or @pagoLoginTarjeta"
        tags = "@pagoLoginTarjeta"
)
public class runnerTest {
}
