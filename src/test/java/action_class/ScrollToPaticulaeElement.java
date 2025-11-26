package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToPaticulaeElement {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		WebElement link=	driver.findElement(By.xpath("//span[.='Wikisource']"));

		Actions action=new Actions(driver);
		action.scrollToElement(link).click().perform();
	}
}


