package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class child_window {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//*[@id=\"copyRight\"]/nobr/a")).click();
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandle()); 
		System.out.println(driver.getWindowHandles()); 

	}

}
