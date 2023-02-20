package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Expedia {

    WebDriver driver = new ChromeDriver();
    @Test
    public void hotelReservation() {
        //1. Search

        //2. Modify search results page, give criteria

        //3. Analyze results and make our selection

        //4. Book reservation

        //5. Fill out contact/ billing

        //6. Get confirmation

    }
    @BeforeMethod
    public void setUp() {

        driver.get("https://www.expedia.com/");

    }

    @AfterMethod
    public void tearDown() {
        
        driver.quit();
    }
}
