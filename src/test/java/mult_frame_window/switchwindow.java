package mult_frame_window;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchwindow {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        Thread.sleep(5000);

        // Click on link to open new window
        driver.findElement(By.linkText("Click Here")).click();

        // Get all window handles
        Set<String> windows = driver.getWindowHandles();

        String parentWindow = driver.getWindowHandle();

        // Switch to child window
        for (String window : windows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println("Child Window Title: " + driver.getTitle());
            }
        }
Thread.sleep(5000);
        // Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Parent Window Title: " + driver.getTitle());

        driver.quit();
    }
}
