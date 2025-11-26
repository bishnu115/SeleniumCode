package TestNg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class softassertequal 

{

	WebDriver driver=null;
	@Test
	public void m1()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		String actual=driver.getTitle();
		String excepted="– log in or sign up";

		SoftAssert s=new SoftAssert();
		s.assertEquals(actual, excepted);
		System.out.println("run");
		s.assertAll();
	}
}
