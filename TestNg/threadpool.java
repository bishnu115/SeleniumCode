package TestNg;

import org.testng.annotations.Test;

public class threadpool {

	
	@Test(invocationCount = 8, threadPoolSize = 3)
	public void c()
	{
		System.out.println("s");
	}
}
