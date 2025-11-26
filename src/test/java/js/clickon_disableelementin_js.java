package js;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickon_disableelementin_js {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.linkText("jdk-8u381-linux-aarch64.rpm")).click();
		WebElement abc = driver.findElement(By.linkText("Download jdk-8u381-linux-aarch64.rpm"));
		js.executeScript("arguments[0].click()",abc);
		
		
	}

}
