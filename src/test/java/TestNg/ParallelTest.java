package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {

    @Test
    public void test1() throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
        System.out.println("google: "+driver.getTitle());
    }

    @Test
    public void test2() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        System.out.println("fb: "+driver.getTitle());
    }

    @Test
    public void test3() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://www.flipkart.com/");
        System.out.println("flip: "+driver.getTitle());
    }
}

