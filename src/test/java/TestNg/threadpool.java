package TestNg;

import org.testng.annotations.Test;

public class threadpool {

	//threadpool we are use to reduce the time,it will run the method via multiple thread
	@Test(invocationCount = 5, threadPoolSize = 5)
	public void c()
	{
		System.out.println("s");
	}
}
