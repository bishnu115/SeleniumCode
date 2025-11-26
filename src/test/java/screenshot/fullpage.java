package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fullpage {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
     String er=   driver.getTitle();
     if(er.equals("dsfsd")){
         System.out.println("Ok");
        }else {
         //special interface takescreenshot
         //type cast driver instance to takescreenshot instance
         TakesScreenshot ts = (TakesScreenshot) driver;
         //we called getsreenshot as method by passing output.file
         //which is capture screenshot and store into src
         File src = ts.getScreenshotAs(OutputType.FILE);
         //above file we can't directly see so we specify location
         File trg = new File(".\\screenshot\\hom.png");
         //copy source file to terget for that we call fileutils.copyfile
         FileUtils.copyFile(src, trg);


     }
		
		
	}

}
