package groceryDelivery;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Blinkit {
	@Test
	public void base()
	{
		System.out.println("this is a tets method in different package");
	}
	@BeforeSuite
	public void track1()
	{
		System.out.println("This is before suite in another package");
	}
	@BeforeClass
	public void sea2()
	{
		System.out.println("this is before class in different package");
	}
	  @BeforeTest
	  public void f6()
	  {
		  System.out.println("This is Before Test");
	  }
}
