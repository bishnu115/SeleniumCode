package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class parameter {
	@Test
	@Parameters({"i","j"})
	public void add(int a,int b)
	{
	System.out.println(a+b);	
	}
//	<suite name="Suite">
	// set the parameter
//	<parameter name="i" value="4"></parameter>
//	<parameter name="j" value="4"></parameter>
//  <test thread-count="5" name="Test">
//    <classes>
	//write the class name
//      <class name="TestNg.parameter"/>

}
