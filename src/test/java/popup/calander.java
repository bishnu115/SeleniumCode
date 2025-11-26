package popup;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calander {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		while(true) {
		try {
			driver.findElement(By.xpath("//span[text()='December']/../../..//span[text()='30']")).click();

		} catch (Exception e) {
			driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
		}
		//driver.findElement(By.xpath("//span[text()='December']/../../..//span[text()='30']")).click();

		}



	}
}


