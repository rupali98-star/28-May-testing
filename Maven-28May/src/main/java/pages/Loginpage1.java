package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	@FindBy (xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement password;

	@FindBy (xpath="//button[text()='Log In']")
	private WebElement loginButton;
	
	@FindBy (xpath="//a[text()='Create New Account']")
	private WebElement createNewAccount;
	
	@FindBy (xpath="//a[text()='Messenger']")
	private WebElement messengerLink;
	
	 public Loginpage1(WebDriver driver123)
		{
	         
			PageFactory.initElements(driver123, this);
		}

	 public void sendUserName() {
		 userName.sendKeys("rupalishingne123@gmail.com");
	 }
	 public void sendPasswordName() {
		 userName.sendKeys("123456");
	 }
	 public void clickOnLoginButton() {
		 loginButton.click();
	 }
	 public void clickOnCreateNewAcc() {
		 loginButton.click();
	 }
	 public void openMessenger() {
		 messengerLink.click();
	 }

	 //complete Functionaliy
	 public void loginApplication() {
		userName.sendKeys("rupalishingne123@gmail.com");
		password.sendKeys("123456");
		loginButton.click();
	}
	 
	 
	
	
	

}

