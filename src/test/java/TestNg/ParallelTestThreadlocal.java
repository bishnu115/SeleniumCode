package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParallelTestThreadlocal {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setUp() {
        driver.set(new ChromeDriver());
    }

    @Test
    public void test1() {
        driver.get().get("https://www.google.com");
        System.out.println("Test 1 - " + Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        driver.get().get("https://www.amazon.com");
        System.out.println("Test 2 - " + Thread.currentThread().getId());
    }

    @AfterMethod
    public void tearDown() {
        driver.get().quit();
        driver.remove();
    }
}