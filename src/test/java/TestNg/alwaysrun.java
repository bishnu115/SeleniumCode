package TestNg;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class alwaysrun {
	
	@Test( alwaysRun = true)
	public void b()
	{
			
		System.out.println("i");
	}
}
