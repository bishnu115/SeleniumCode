package TestNg;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class dependson 
{

	@Test
	public void a()
	{
		//assert.fail();//deliberately fail
		System.out.println("b");
	}
	@Test(dependsOnMethods = "a")
	public  void b()
	{
		
		
		System.out.println("i");
	}

	@Test
	public void c()
	{
		System.out.println("s");
	}
}
