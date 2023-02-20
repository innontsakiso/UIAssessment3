package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTests {

    public void setUp(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        //Login
        WebElement inputUsername = driver.findElement(By.id("user-name"));
        inputUsername.click();
        inputUsername.sendKeys("standard_user");

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.click();
        inputPassword.sendKeys("secret_sauce");

        WebElement clickLogin = driver.findElement(By.id("login-button"));
        clickLogin.click();

        //Add Item to card
        WebElement selectItem = driver.findElement(By.id("item_5_title_link"));
        selectItem.click();

        WebElement addCart = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addCart.click();

        //Checkout
        WebElement insideCart = driver.findElement(By.className("shopping_cart_link"));
        insideCart.click();

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();

        //Enter personal info
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.click();
        firstName.sendKeys("Innocentia");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.click();
        lastName.sendKeys("Mokgalaka");

        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.click();
        postalCode.sendKeys("2001");

        //continue
        WebElement continueCheckout = driver.findElement(By.id("continue"));
        continueCheckout.click();

        //finish
        WebElement finishCheckout = driver.findElement(By.id("finish"));
        finishCheckout.click();

        System.out.println(driver.getTitle());
//        driver.close();
        // driver.quit();
    }
    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();

    }
}



