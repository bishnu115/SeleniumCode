package TestNg;

import org.testng.annotations.*;

public class TestNGAnnotationsDemo {

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest executed");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest executed");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass executed");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass executed");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod executed");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod executed");
    }

    @Test
    public void test1() {
        System.out.println("Test1 executed");
    }

    @Test
    public void test2() {
        System.out.println("Test2 executed");
    }

    @BeforeGroups("regression")
    public void beforeRegressionGroup() {
        System.out.println("Before Regression Group executed");
    }

    @AfterGroups("regression")
    public void afterRegressionGroup() {
        System.out.println("After Regression Group executed");
    }

    @Test(groups = "regression")
    public void regressionTest() {
        System.out.println("Regression Test executed");
    }
}