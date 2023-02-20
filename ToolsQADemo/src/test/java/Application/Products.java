package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Products {
    @Test
    public void products() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://shop.demoqa.com/shop");


        //Navigate into the website
        WebElement dismiss = driver.findElement(By.className("woocommerce-store-notice__dismiss-link"));
        dismiss.click();

        WebElement myAccount = driver.findElement(By.linkText("My Account"));
        myAccount.click();

        //Login to website
        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("Inno");

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("BisoKgali@1");

        WebElement login = driver.findElement(By.name("login"));
        login.click();

        WebElement shop = driver.findElement(By.linkText("custom-logo-link"));
        shop.click();


    }
}
