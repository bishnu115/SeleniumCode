package action_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_RightClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ritclick= driver.findElement(By.name("login"));
		Actions action=new Actions(driver);
		action.contextClick(ritclick).perform();
		//robot use for keyboard operation
		Robot robot=new Robot();
		for(int i=0;i<3;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
		}
		//if keypress then u write code for keyrelease
		//otherwise keypress action is continue
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
