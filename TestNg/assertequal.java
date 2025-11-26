package TestNg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assertequal 

{
	@Test
	public void verify()
	{
		String g="Google";
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	 String aa= driver.getTitle();
	 System.out.println(aa);
	 assertEquals(g, aa);
		
	}

}
