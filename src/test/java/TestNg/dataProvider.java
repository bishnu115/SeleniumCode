 package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

    @Test(dataProvider = "aaa")
    public void m1(String name, String age) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement el=   driver.findElement(By.name("q"));
     el.sendKeys(name + " " + age);
        el.sendKeys(Keys.ENTER);
Thread.sleep(4000);
        driver.quit();
    }

    @DataProvider(name = "aaa")
    public Object[][] seaechdata() {

        return new Object[][] {
                {"srk", "age"},
                {"salman", "age"},
                {"kajol", "age"}
        };
    }
}

