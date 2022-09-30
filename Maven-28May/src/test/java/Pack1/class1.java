package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Loginpage1;
import pages.Messengerpage;
import pages.Roomspage;

public class class1 {
	public class verifyRoomspage {
		
		private WebDriver   driver ;
		private Loginpage1    loginpage1;
		private Roomspage roomspage;
			 @BeforeClass
			   public void openBrowser()
			   {
				   System.out.println("Before Class");
				   System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipali\\Desktop\\automation\\chromedriver_win32 (2)\\chromedriver.exe");
					   driver = new ChromeDriver();
					  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
			   }
			   @BeforeMethod
			   public void openRoompage() 
			   {
				   System.out.println("Before Method");
				   
				   driver.get("https://www.facebook.com/");
					 
					 Loginpage1 loginpage1 = new Loginpage1(driver);
					 loginpage1.openMessenger();
					 
					 Messengerpage messengerpage = new Messengerpage(driver);
					 messengerpage.openRooms();
					
					 
					 Roomspage roomspage = new Roomspage(driver);
			   }
			   @Test
			   public void verfiyContactToHelpCentreButon() 
			   {
				   System.out.println("test1");
				   roomspage.contactToHelpcentre();
				   
				   String url = driver.getCurrentUrl();
				   String title = driver.getTitle();
				   if(url.equals("blikiii")&&title.equals("Mhjj") ) {
					   System.out.println("PASS");
				   }
				   else
				   {
					   System.out.println("FAIL");
				   }
			   }
			   @Test
			   public void verifyReturnToMessengerButton() {
				    System.out.println("test2");
				   roomspage.goBackToMessenger();
			    String url = driver.getCurrentUrl();
			    String title = driver.getTitle();
			    
			     if(url.equals("hbj")&&title.equals("Mess") ) {
					   System.out.println("PASS");
			     }
			     else
			     {
			    	 System.out.println("FAIL");
			     }
			     
			   }
			  
			   @AfterMethod
			   public void logoutFromApplication() 
			   {
				  System.out.println("After Method"); 
				  System.out.println("LOGOUT");
			   }
			   
			   @AfterClass
			   public void afterclass() 
			   {
				  System.out.println("After Class"); 
				  driver.close();
			   }


			}







}
