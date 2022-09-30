package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipali\\Desktop\\automation\\chromedriver_win32 (2)\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		
		
		 driver.get("https://www.facebook.com/");
	}

}
