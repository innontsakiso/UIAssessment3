package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefinition {
        WebDriver driver = new ChromeDriver();
        @Given("^User is on landing page$")
        public void user_is_on_landing_page() throws Throwable {

                System.setProperty("webdriver.chromedriver","C:/Users/Thabiso/Desktop/Projects/AssessmentThree/resources/chromedriver.exe");
                driver.get("https://www.saucedemo.com");
//                System.out.println("Navigated to url");
        }


        @When("^User login to application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
        public void user_login_to_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {

                System.out.println(strArg1);
                System.out.println(strArg2);

        }

        @Then("^Home page is populated$")
        public void home_page_is_populated() throws Throwable {

                System.out.println("Validated  homepage");
        }

        @And("^Products displayed$")
        public void products_displayed() throws Throwable {
                System.out.println("Validated products");

        }
}
