package Pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	 @BeforeSuite
	   public void beforeSuite()
	   {
		   System.out.println("Before Suite TestClass -1");
	   }
	 @BeforeTest
	   public void beforeTest()
	   {
		   System.out.println("Before Test");
	   }
	 @BeforeClass
	   public void beforeclass()
	   {
		   System.out.println("Before Class");
	   }
	   @BeforeMethod
	   public void beforemethod ()
	   {
		   System.out.println("Before Method TestClass -1");
	   }
	   
	   @Test
	   public void test1() 
	   {
		   System.out.println("test1");
	   }
	   @Test
	   public void test2()
	   {
		   System.out.println("test3");
	   }
	   @Test
	   public void test3() 
	   {
		   System.out.println("test3");
	   }
	   @Test
	   public void test4()
	   {
		   System.out.println("test4");
	   }
	  
	   @AfterMethod
	   public void aftermethod() 
	   {
		  System.out.println("After Method TestClass -1"); 
	   }
	   @AfterClass
	   public void afterclass() 
	   {
		  System.out.println("After Class"); 
	   }
	   @AfterTest
	   public void aftertest() 
	   {
		  System.out.println("After Test"); 
		  
	   }
	 
	   @AfterSuite
	  public void aftersuite()
	  {
		  System.out.println("After Suite Test class-1");
	  }


	}


