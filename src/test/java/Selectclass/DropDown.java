package Selectclass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		//the element we store in drop
		WebElement drop=driver.findElement(By.name("employees_c"));
		//by select class we use that element
		Select select=new Select(drop);
		//by value we select
		select.selectByValue("level2");
         //select by indx
		select.selectByIndex(3);
         //select byvisibletext
		select.deselectByVisibleText("1 - 10 employees");
		select.deselectAll();
		//select.deselectByVisibleText();
		//select.deselectByValue();
	}

}
