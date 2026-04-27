package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class dfg {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com");
    }
    @Test
    public void loginTest() {

        Withoutpagefactory loginPage = new Withoutpagefactory(driver);

        loginPage.loginMethod("yourUsername", "yourPassword");

        System.out.println("Login method executed");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
