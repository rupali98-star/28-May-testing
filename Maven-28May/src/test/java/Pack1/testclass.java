package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Loginpage1;
import pages.Messengerpage;
import pages.Roomspage;

public class testclass {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipali\\Desktop\\automation\\chromedriver_win32 (2)\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		
		
		 driver.get("https://www.facebook.com/");
		 
		 Loginpage1 loginpage1 = new Loginpage1(driver);
		 loginpage1.openMessenger();
		 
		 Messengerpage messengerpage = new Messengerpage(driver);
		 messengerpage.openRooms();
		 Thread.sleep(3000);
		 
		 Roomspage roomspage = new Roomspage(driver);
          roomspage.contactToHelpcentre();
          
          System.out.println(driver.getCurrentUrl());
}
}
