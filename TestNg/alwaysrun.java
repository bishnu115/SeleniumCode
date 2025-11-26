package TestNg;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class alwaysrun {

	

	@Test
	public void a()
	{
		assert.fail();//deliberately fail
		System.out.println("b");
	}
	@Test(dependsOnMethods = "a" , alwaysRun = true)
	public void b()
	{
			
		System.out.println("bishnu anil");
	}
}
