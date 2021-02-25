package test.com.jeferson.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/Utest.feature",
        tags="@stories",
        glue="test.com.jeferson",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
