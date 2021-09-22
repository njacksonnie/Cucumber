package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/feature/Login.feature",
        glue = {"stepdefinition"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class AnyDoLoginRunner extends AbstractTestNGCucumberTests {

}