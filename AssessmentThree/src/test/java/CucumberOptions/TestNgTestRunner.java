package CucumberOptions;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/Features",
glue = "StepDefinition")
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
