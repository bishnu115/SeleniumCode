package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alart {

	public static void main(String[] args) throws InterruptedException
	{ 
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
//		String tex = alert.getText();
//		System.out.println(tex);
		//alert.accept();
		alert.dismiss();

	}

}
