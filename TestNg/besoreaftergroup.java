package TestNg;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
public class besoreaftergroup 
{
	@BeforeGroups(value="regression")
	public void a()
	{
		System.out.println("before group executed");
	}
	@AfterGroups(value="regression")
	public void b()
	{
		System.out.println("after group executed");
	}
	@Test(groups="regression")
	public void c()
	{
		System.out.println("test executed");
	}


}
