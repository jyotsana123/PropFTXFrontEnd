package FrontEnd.AbstractComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbstractComponent {

	WebDriver driver;
	public AbstractComponent(WebDriver driver)
	{
	this.driver=driver;
}
	
	@FindBy(css=".login-btn")
	WebElement loginbutton;
	
	@FindBy(id="phone")
	WebElement phonenumber;
	
	@FindBy(css=".get-otp-button")
	WebElement getotpbutton;
	
	
	public void clickOnLoginButton()
	{
		loginbutton.click();
	}
	
	public void clickOnGetOTPButton()
	{
		getotpbutton.click();
	}
	
	public void enterPhoneNo(String phoneNumber)
	{
		phonenumber.sendKeys(phoneNumber);
	}
	
//	public void getOTPsentmessage()
//	{
//		OTPsentmessage.getText();
//	}
}
