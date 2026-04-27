package TestNg;

import org.testng.annotations.Test;

public class threadpool {
    @Test(invocationCount = 10, threadPoolSize = 5)
    public void loginTest() {
        System.out.println("Login test running: " + Thread.currentThread().getId());

    }
}