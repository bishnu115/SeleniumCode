package driver_method;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validate_Title {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		String actual=driver.getTitle();
		String excepted="google";
		if(actual.equalsIgnoreCase(excepted)) 
		{
			System.out.println("Title is match");
		}
		else
			System.out.println("Title is not match");
		
		driver.quit();
	}

}
