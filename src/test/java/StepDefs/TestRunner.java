package StepDefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/TradeMeSandbox.feature",
        glue = {"StepDefs"},
        plugin = {"json:target/cucumber.json"}
)
public class TestRunner {

}
