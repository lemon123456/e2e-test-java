package e2e.test.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        format = { "pretty","html: cucumber-html-reports"},
        dryRun = false,
        glue = "e2e.test.cucumber")
public class RunCukesTest {
}
