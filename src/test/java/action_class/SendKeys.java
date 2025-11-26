package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 WebElement send= driver.findElement(By.name("email"));
		 send.sendKeys("bishnu");
		 
		Actions action=new Actions(driver);
	
		//tab for next bar
		action.sendKeys(Keys.TAB).sendKeys("manager").perform();
	
	}

}
