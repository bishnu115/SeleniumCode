package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prompt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("bishnu");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}

}
