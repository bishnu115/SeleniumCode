package action_class;

import java.awt.AWTException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class click {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.name("login"));
		 Actions action=new Actions(driver);
	action.click(link).perform();

	}

}
