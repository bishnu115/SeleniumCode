package TestNg;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listners.class)
public class litnersclass {
	@Test
	public void m1()
	{
		System.out.println("m1");
	}
	@Test
	public void m2()
	{
		Assert.assertTrue(false);
		System.out.println("m2");

	}
	@Test(timeOut=1000)
	public void m3() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("m3");	
	}
}
