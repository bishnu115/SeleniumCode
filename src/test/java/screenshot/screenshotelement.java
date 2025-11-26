package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshotelement {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		} catch (Exception e) {
		}
		//driver.findElement(By.name("q")).sendKeys("iphone13");
		WebElement ts = driver.findElement(By.xpath("//img[contains(@alt,'Flipkart')]"));

		File src = ts.getScreenshotAs(OutputType.FILE);
		// above file we can't directly see so we specify location
		File trg = new File(".\\screenshot\\elemesnt.png");
		// copy source file to terget for that we call fileutils.copyfile
		FileUtils.copyFile(src, trg);
		System.out.println("ok");
		driver.quit();
	}

}
