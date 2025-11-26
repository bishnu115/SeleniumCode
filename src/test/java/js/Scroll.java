package js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException
	{
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.myntra.com/");
   
   JavascriptExecutor js=(JavascriptExecutor)driver;
   
   //scroll by using pixel
   //js.executeAsyncScript("window.scrollBy(0,2000)");
   
   //scroll till we find element
   WebElement find=driver.findElement(By.xpath("//*[@id=\"web-footerMount\"]/div/footer/div/div[1]/div[2]/a[10]"));
   js.executeScript("arguments[0].scrollIntoview();",find);
  
	}

}
