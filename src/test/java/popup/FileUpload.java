 package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//*[@id=\"register_Layer\"]")).click();
		//if in HTML code type=file then we directly sendkeys(filelocation) use
		// otherwise we use robot class
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		
		//for file selection we use this
		StringSelection file=new StringSelection("C:\\Users\\Lenovo\\Desktop\\api");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		
		//robot class for pest the location and enter
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		//for enter 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
