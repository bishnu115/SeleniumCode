package TestNg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class hardassertion {
WebDriver driver;
	@Test
	public void m1()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		String actual=driver.getTitle();
		String excepted="Facebook – log in or sign up";

		assertEquals(actual, excepted);
		System.out.println("match");
	}
	}

