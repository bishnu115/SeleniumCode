package Navigate;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dem {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement w= driver.findElement(By.name("q"));
		w.sendKeys("iphone15");
		w.submit();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
	
		Set<String> handle = driver.getWindowHandles();
		Iterator it = handle.iterator();
		String parentid = (String)it.next();
		String childid = (String)it.next();
		driver.switchTo().window(childid);

		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		
	}

}
