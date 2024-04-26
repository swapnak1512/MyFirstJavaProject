package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"StepDefinitions"},
        plugin = {"pretty",
                "html:target/CucumberReport/report.html",
                "json:target/CucumberReport/report.json"},
//        tags="@regressiontest",
        monochrome = true
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}