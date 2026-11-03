import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class demo {
    public static void main(String[] args) throws IOException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
     List<WebElement>AllLinks=driver.findElements(By.tagName("a"));

        System.out.println(AllLinks.size());
        for (WebElement link:AllLinks){
           String url= link.getAttribute("href");
           URL r=new URL(url);
         HttpURLConnection c= (HttpURLConnection)r.openConnection();
         c.setRequestMethod("HEAD");
         c.connect();
         int code=c.getResponseCode();
            if(code>400){
                System.out.println(url+" invalife");
            }else {
                System.out.println(url+"valide");
            }
        }




}
    }





