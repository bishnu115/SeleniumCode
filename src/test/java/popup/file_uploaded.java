package popup;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class file_uploaded{

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shine.com/");
		//driver.findElement(By.xpath(//a[text()="Login"])).click();
		//Actions action=new Actions(driver);
		//action.sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Lenovo\\Desktop\\y.docx");
		
	}

}
