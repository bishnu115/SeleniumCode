package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {

    @Test
    public void test1() throws InterruptedException {
        System.out.println("Test1 running on thread: " + Thread.currentThread().getId());
        Thread.sleep(2000);
    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println("Test2 running on thread: " + Thread.currentThread().getId());
        Thread.sleep(2000);
    }

    @Test
    public void test3() throws InterruptedException {
        System.out.println("Test3 running on thread: " + Thread.currentThread().getId());
        Thread.sleep(2000);
    }
}

