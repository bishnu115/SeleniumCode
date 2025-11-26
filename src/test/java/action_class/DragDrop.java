package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		WebElement drag = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
	}

}
