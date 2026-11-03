import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class FetchTableData {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selectorshub.com/xpath-practice-page");
        driver.get("https://selectorshub.com/xpath-practice-page");
        List<WebElement> ss = driver.findElements(By.xpath("//*[@id='resultTable']//tr//td[2]"));
        for (WebElement s : ss) {
            System.out.println(s.getText());
        }
        driver.close();
    }
}
