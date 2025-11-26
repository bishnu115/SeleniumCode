package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
    @Test(dataProvider = "logintdata")
    public void login(String username, String passwoard) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/www.facebook.com");
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(passwoard);
        driver.findElement(By.name("login")).click();
        Thread.sleep(5000);
        driver.quit();
    }

    @DataProvider(name = "logintdata")
    public Object[][] logindataa() {
        Object[][] data = new Object[2][2];
        data[0][0] = "admin";
        data[0][1] = "ad";

        data[1][0] = "admin";
        data[1][1] = "adr";
        return data;
    }
}
// new one
//    @DataProvider(name = "loginData")
//    public Object[][] getData() {
//        return new Object[][] {
//                {"user1", "pass1"},
//                {"user2", "pass2"},
//                {"user3", "pass3"}
//        };
//    }
//
//    @Test(dataProvider = "loginData")
//    public void loginTest(String username, String password) {
//        System.out.println("Logging in with: " + username + " / " + password);
//
//
//    }
//}
