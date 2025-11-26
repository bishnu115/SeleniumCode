package driver_method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		// Set the window size using the manage() method
		driver.manage().window().setSize(new Dimension(800, 600)); // Replace with your desired width and height

		// Navigate to a website
		driver.get("https://www.google.com");


		driver.quit();

}

}
