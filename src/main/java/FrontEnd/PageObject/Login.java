package FrontEnd.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrontEnd.AbstractComponent.AbstractComponent;

public class Login extends AbstractComponent {

	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".login-btn")
	WebElement loginbutton;
	
//	@FindBy(id="phone")
//	WebElement phonenumber;
	
//	@FindBy(css=".get-otp-button")
//	WebElement getotpbutton;
	
	@FindBy(css="button[type='submit']")
	WebElement verifybutton;
	
	public void openWebsite()
	{
		driver.get("https://propftxdev.iworklab.com/");
	}
	
//	public void clickOnLoginButton()
//	{
//		loginbutton.click();
//	}
	
//	public void enterPhoneNo(String phoneNumber)
//	{
//		phonenumber.sendKeys(phoneNumber);
//	}
	
//	public void clickOnGetOTPButton()
//	{
//		getotpbutton.click();
//	}
	
	public void clickOnVerifyButton() throws InterruptedException
	{
		Thread.sleep(20000);
		verifybutton.click();
	}
	
}



//driver.findElement(By.cssSelector(".login-btn")).click();
//driver.findElement(By.id("phone")).sendKeys("9310980049");
//driver.findElement(By.cssSelector(".get-otp-button")).click();
//Thread.sleep(20000);
//driver.findElement(By.cssSelector(".get-otp-button")).click();