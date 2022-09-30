package Pack1;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass1 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
    @Test (priority = 3)
    public void testA() {
    	System.out.println("Test A");
    }
    
    @Test (priority = 1,invocationCount = 3)
    public void testB() {
    	System.out.println("Test B");
    }
    @Test (priority = 2)
    
    public void testC() {
    	System.out.println("Test C");
    	
    }
    @Test (priority = 1)
    public void testD() {
    	System.out.println("Test D");
    }
    @AfterMethod
    public void aftermethod() {
    	System.out.println("After Method");
    }
    	
   @AfterClass
   public void  afterClass() {
	   System.out.println("After Class");
	   
   }
    	
    	
    	}
    
    	
    	
    	
    

