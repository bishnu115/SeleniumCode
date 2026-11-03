import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class shadowDOM {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://selectorshub.com/xpath-practice-page");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // LEVEL 1: Access first shadow host
        WebElement shadowHost1 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("div#userName")  // Verify this selector
        ));

        // Get first shadow root
        SearchContext shadowRoot1 = shadowHost1.getShadowRoot();

        // Find element in first shadow DOM
        WebElement nameField = shadowRoot1.findElement(By.cssSelector("#kils"));
        nameField.clear();
        nameField.sendKeys("bishnu");

        System.out.println("First shadow DOM element filled!");

        // LEVEL 2: Find the second shadow host INSIDE the first shadow DOM
        WebElement shadowHost2 = shadowRoot1.findElement(
                By.cssSelector("div#app2")  // Replace with actual nested shadow host selector
        );

        // Get second (nested) shadow root
        SearchContext shadowRoot2 = shadowHost2.getShadowRoot();

        // Find pizza field inside the nested shadow DOM
        WebElement pizzaField = shadowRoot2.findElement(By.cssSelector("#pizza"));
        pizzaField.clear();
        pizzaField.sendKeys("small");

        System.out.println("Nested shadow DOM element filled!");
    }
}
