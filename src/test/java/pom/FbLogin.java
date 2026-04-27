package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FbLogin {

    WebDriver driver;

    @FindBy(name = "email")
    WebElement username;

    @FindBy(name = "pass")
    WebElement password;

    @FindBy(name = "login")
    WebElement loginBtn;
    public FbLogin(WebDriver driver) {
        this.driver = driver;  // ✅ important
        PageFactory.initElements(driver, this);
    }

    public void loginMethod(String user, String pass) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(user);
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pass);

        loginBtn.click();
    }
}