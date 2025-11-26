package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallal {

		WebDriver driver=null;
		@Test
		public void m1()
		{
		driver=new FirefoxDriver();	
		driver.get("https://www.facebook.com/");
		}
		@Test
		public void m2()
		{
			driver=new EdgeDriver();	
			driver.get("https://www.google.co.in/");	
		}

	}

