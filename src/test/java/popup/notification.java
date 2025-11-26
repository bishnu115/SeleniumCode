package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification {

	public static void main(String[] args) {
		ChromeOptions setting=new ChromeOptions();
		//chromium command search in google
		setting.addArguments("--disable-notifications");
		//setting.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(setting);
		driver.get("https://www.yatra.com/");
	}

}
