package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforeafter 
{
	@BeforeTest  //it executed 1 time(1st this executed)
	public void a()
	{
		System.out.println("before test is execuated");
	}
	@AfterTest  // it executed 1 time(last this is executed)
	public void b()
	{
		System.out.println("after test is execuated");
	}
	
	@BeforeMethod   //it will executed before every @test
	public void c()
	{
		System.out.println("before method is execuated");
	}@AfterMethod   //it will executed after every @test
	public void d()
	{
		System.out.println("after method is execuated");
	}
	@Test
	public void e()
	{
		System.out.println("1st test execuated");	
	}
	@Test
	public void f()
	{
		System.out.println("2nd test execuated");	
	}
	
	

}
