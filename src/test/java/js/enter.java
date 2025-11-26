package js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enter {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		 WebElement username= driver.findElement(By.id("email"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='bishnu'", username);
	}

}
