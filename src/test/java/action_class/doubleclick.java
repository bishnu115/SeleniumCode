package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement link= driver.findElement(By.xpath("//button[.=' Double click Here   ']"));
		Actions action=new Actions(driver);
		//doubleClick(webElementtarget)
		action.doubleClick(link).perform();
	}

}
