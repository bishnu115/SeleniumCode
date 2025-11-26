package Navigate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		WebElement ab=driver.findElement(By.name("q"));
		ab.sendKeys("flipkart");
		ab.submit();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//2nd approach
		/*driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
	}

}
