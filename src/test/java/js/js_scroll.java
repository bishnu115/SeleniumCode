package js;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_scroll {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(;;) {
			try {
				driver.findElement(By.partialLinkText("Father's Day 2023 (Jun 04)")).click();
			}
			catch(Exception e){
				js.executeScript(("window.scrollBy(0,500)"));

			}// type window.scrollBy(0,500) in consol developer bar

		}
	}



}

