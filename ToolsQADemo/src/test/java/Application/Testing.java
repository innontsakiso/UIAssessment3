package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Testing {
@Test
    public void testing(){

        Login l = new Login();
        l.login();
//        Products p = new Products();
//        p.products();
    }
}
