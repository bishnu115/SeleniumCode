package TestNg;

import org.testng.annotations.Test;


public class groupexecuation
{

	@Test(groups="intigration")
	public void a()
	{
		System.out.println("intigration");
		
	}
	@Test(groups={"intigration","regression"})
	public void b()
	{
		System.out.println("intigration , regression");
		
	}
	@Test(groups={"intigration","regression"})
	public void c()
	{
		System.out.println("intigration , regression");
		
	}
	@Test(groups="regression")
	public void d()
	{
		System.out.println("regression");
		
	}

}
