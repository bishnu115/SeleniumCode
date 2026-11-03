import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        // Get all anchor tags
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Links : " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");
            // Skip null or empty links
            if (url == null || url.isEmpty()) {
                System.out.println("URL is Empty");
                continue;
            }
            try {
                URL r = new URL(url);
                HttpURLConnection c =(HttpURLConnection) r.openConnection();
                c.setRequestMethod("HEAD");
                c.connect();
                int re = c.getResponseCode();
                if (re >= 400) {

                } else {
                    System.out.println(url + " --> Valid Link : " + re);
                }
            } catch (Exception e) {
                System.out.println(url + " --> Invalid URL");
            }
        }
        driver.quit();

    }

}