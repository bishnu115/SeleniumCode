 package TestNg;

import org.testng.annotations.Test;

public class invocationcount {


	@Test
	public void a()
	{
		System.out.println("abc");
	}
	@Test(priority = 2,invocationCount = 4)
	public void b()
	{
		System.out.println("4");
	}

	@Test(priority = 1,invocationCount = 1)
	public void c()
	{
		System.out.println("1");
	}
}


