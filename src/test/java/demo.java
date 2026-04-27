import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo {

    static WebDriver driver;

    public static void getTitle() {
        System.out.println("title is :" + driver.getTitle());
    }

    public static void getURL() {
        System.out.println("url is: " + driver.getCurrentUrl());
    }

    public static void maximise() {
        String env = "local";
        if (env.equalsIgnoreCase("local")) {
            driver.manage().window().maximize();
            System.out.println("window maximise as it is a local env");
        } else {
            driver.manage().window().setSize(new Dimension(1920, 1080));
            System.out.println("window maximise as it is a ci/cd env");

        }
    }

    public static void deletecookies() {
        driver.manage().deleteAllCookies();

    }
    public static void pagesource() {
        System.out.println("page source is"+driver.getPageSource());

    }

    public static void main(String[] args) {
        driver = new ChromeDriver();
        maximise();
        deletecookies();
        driver.get("https://the-internet.herokuapp.com");
        getTitle();
        getURL();
      //  pagesource();

        //   driver.close();

    }


}


