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
		System.out.println("def");
	}

	@Test(priority = 1,invocationCount = 1)
	public void c()
	{
		System.out.println("ghi");
	}
}


