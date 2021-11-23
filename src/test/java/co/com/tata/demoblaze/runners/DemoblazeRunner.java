package co.com.tata.demoblaze.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/demoblaze.feature",
        //tags = "@RutaCritica",
        glue = {"co.com.tata.demoblaze.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)

public class DemoblazeRunner {
}
