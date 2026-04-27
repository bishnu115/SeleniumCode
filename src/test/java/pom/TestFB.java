package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pom.FbLogin;

import java.time.Duration;

public class TestFB {

    @Test
    public void m1() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com");

        FbLogin fb = new FbLogin(driver);
        fb.loginMethod("bishnu", "sasas");

        driver.quit();
    }
}