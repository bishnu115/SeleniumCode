package TestNg;

import org.testng.annotations.Test;

public class excludeTest {

  @Test
  public void m1()
  {
	  System.out.println("bishnu");
  }
  @Test(enabled = false)
  public void m2()
  {
	  System.out.println("hii");
  }
}
