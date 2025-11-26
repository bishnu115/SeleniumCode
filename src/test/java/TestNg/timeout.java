package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class timeout {

	@Test(timeOut = 50000)
	public void m1() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("bishnu");
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.navigate().back();
		
	}
}
