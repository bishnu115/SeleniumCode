package TestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Enableattribute
{
	@Test
	public void a()
	{
		System.out.println("b");
	}
	@Ignore
	@Test
	public void b()
	{
		System.out.println("i");
	}

	@Test
	public void c()
	{
		System.out.println("s");
	}

    @Test(enabled = false)
    public void m2()
    {
        System.out.println("hii");
    }
}
