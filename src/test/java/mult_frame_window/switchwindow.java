package mult_frame_window;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchwindow {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		
//		Set<String> handle = driver.getWindowHandles();
//		Iterator it = handle.iterator();
//		String parentid = (String)it.next();
//		String childid = (String)it.next();
//		driver.switchTo().window(childid);

        String parentWindow = driver.getWindowHandle();
        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();
        // Switch to child window
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to Child Window: " + driver.getTitle());  } }
        // Switch back to parent window
        driver.switchTo().window(parentWindow);
        driver.findElement(By.xpath("//a[text()='Log in']")).click();

	}

}
