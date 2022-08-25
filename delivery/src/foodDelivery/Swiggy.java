package foodDelivery;

import org.testng.annotations.*;

public class Swiggy {
	@Test
	public void display()
	{
		System.out.println("This is a new method in dell class");
	}
	public void mouse()
	{
		System.out.println("this is standalone method which does not have any testng annotation");
	}
	@BeforeSuite
	public void track()
	{
		System.out.println("This is before suite in another class");
	}
	@BeforeClass
	public void sea()
	{
		System.out.println("this is before class in different class");
	}
	

}
