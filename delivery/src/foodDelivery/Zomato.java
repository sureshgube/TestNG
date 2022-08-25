package foodDelivery;


import org.testng.annotations.*;

import org.testng.annotations.Parameters;

public class Zomato {
	@Test
	@Parameters({"browser","URL"})
	  public void f1(@Optional("bitly.com")String b1, String b2) {
		  System.out.println("****TestNG Parameters One*************"+b1);
		  System.out.println("****TestNG Parameters Two*************"+b2);
	  }
	  
	  @BeforeMethod
	  public void f2()
	  {
		  System.out.println("This is Before Method");
	  }
	  
	  @AfterMethod
	  public void f3()
	  {
		  System.out.println("This is After Method");
	  }
	  
	  
	  @BeforeClass
	  public void f4()
	  {
		  System.out.println("This is before class");
	  }
	  
	  @AfterClass
	  public void f5()
	  {
		  System.out.println("This is after class");
	  }
	  
	  @BeforeTest
	  public void f6()
	  {
		  System.out.println("This is Before Test");
	  }
	  
	  @AfterTest
	  public void f7()
	  {
		  System.out.println("This is After Test");
	  }
	  
	  @BeforeSuite
	  public void f8()
	  {
		  System.out.println("This is Before Suite");
	  }
	  
	  @AfterSuite
	  public void f9()
	  {
		  System.out.println("This is AfterSuite");
	  }
}
