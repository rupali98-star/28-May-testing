package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	//Declaration
	@FindBy (xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement password;

	@FindBy (xpath="//button[text()='Log In']")
	private WebElement loginButton;
	//initialization
	
   public Loginpage(WebDriver driver)
	{
         
		PageFactory.initElements(driver, this);

}
	public void loginfacebook() {
		userName.sendKeys("Velocity");
		password.sendKeys("12345");
		loginButton.click();
	}
	}
