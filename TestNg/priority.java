package TestNg;

import org.testng.annotations.Test;


public class priority 
{
	@Test(priority=1)
	public static void g()
	{
		 System.out.println("bishnu");	
	}
	@Test(priority=3)
	public void a()
	{
		 System.out.println("a");	
	}
	@Test(priority=4)
	public void k()
	{
		 System.out.println(" h");	
	}
	@Test(priority=2)
	public void l()
	{
		 System.out.println("fd");	
	}
  
	
}
