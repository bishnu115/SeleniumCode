package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fblogin

{
	public WebDriver driver;

	@FindBy(id="email")
	WebElement un;
	
	@FindBy(id="pass")
	WebElement pd;
	
	@FindBy(name="login")
	WebElement ld;
	
	

	public fblogin(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
		//this.driver=driver;
	}
	public void loginmethod()
	{
		un.sendKeys("bishnu");
		pd.sendKeys("fghjk");
		ld.click();
	}
	
	
	
}
	

