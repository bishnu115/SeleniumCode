package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class beforeafterclass 
{
	@BeforeClass
	public void a()
	{
		System.out.println("before class executed");
	}
	@AfterClass
	public void b()
	{
		System.out.println("after class executed");
	}
	@Test
	public void c()
	{
		System.out.println("test executed");
	}
	

}
