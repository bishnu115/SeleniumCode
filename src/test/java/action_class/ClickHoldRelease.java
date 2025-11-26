package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldRelease {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	WebElement link=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
	Actions action=new Actions(driver);
	action.clickAndHold(link).perform();
	action.release(link).perform();
	
	}

}

