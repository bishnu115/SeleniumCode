package js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAlert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Alert('dsffs')");



	}

}
