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
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.myntra.com/");
        String er = driver.getTitle();
        if (er.equals("dsfsd")) {
            System.out.println("Ok");
        } else {

            TakesScreenshot ts = (TakesScreenshot) driver;

            File src = ts.getScreenshotAs(OutputType.FILE);
            File trg = new File(".\\screenshot\\houm.png");
            FileUtils.copyFile(src, trg);
            driver.close();

        }


    }

}
