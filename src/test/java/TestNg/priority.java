package TestNg;

import org.testng.annotations.Test;


public class priority 
{
	@Test(priority=-1)
	public static void g()
	{
		 System.out.println("1");
	}
	@Test(priority=3)
	public void a()
	{
		 System.out.println("3");
	}
	@Test(priority=4)
	public void k()
	{
		 System.out.println(" 4");
	}
	@Test
	public void l()
	{
		 System.out.println("2");
	}
  
	
}
