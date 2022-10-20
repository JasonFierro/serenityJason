package runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(publish = true,
        features = {"src/test/resources/features/"},
        glue = {"stepDefinitions"},
        tags = "@Login",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class runnerTest {
}
