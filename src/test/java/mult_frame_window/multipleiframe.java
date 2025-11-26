package mult_frame_window;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleiframe {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		//1st frame
		driver.switchTo().frame("packageListFrame");// frame name
		driver.findElement(By.xpath("/html/body/main/ul/li[5]/a")).click();
		driver.switchTo().defaultContent();//go to main frame
		Thread.sleep(3000);

		//2nd frame
		driver.switchTo().frame("packageFrame");//frame name
		driver.findElement(By.xpath("/html/body/main/ul/li[8]/a")).click();
		driver.switchTo().defaultContent();

	}

}
