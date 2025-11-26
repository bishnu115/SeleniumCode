package TestNg;

import org.testng.annotations.Test;
//@Test (groups="log-in") write this before class then select group as log in this class will execute
public class groupexecuation
{
	//it will execute group wise
	//run as configuration then browse select group only that group execute
	
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
