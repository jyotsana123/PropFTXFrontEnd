package FrontEnd.Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import FrontEnd.BaseTest.BaseTest;
import FrontEnd.PageObject.SignUp;

public class SignUpTest extends BaseTest {

	@Test
	public void signUp() {
		login.clickOnLoginButton();
		SignUp signup = new SignUp(driver);
		signup.clickOnSignup();
		signup.enterName("Annu");
		login.enterPhoneNo("9310980049");
		login.clickOnGetOTPButton();
		String msg = driver.findElement(By.cssSelector("div[class*='Toastify__toast-container']")).getText();
		Assert.assertEquals(msg, "OTP sent successfully");
	}

	@Test
	public void signUpwithoutName() {
		login.clickOnLoginButton();
		SignUp signup = new SignUp(driver);
		signup.clickOnSignup();
		signup.enterName("");
		login.enterPhoneNo("9310980049");
		login.clickOnGetOTPButton();
		signup.getErrorMsg1();
	}

	@Test
	public void signUpwithoutPhoneNum() {
		login.clickOnLoginButton();
		SignUp signup = new SignUp(driver);
		signup.clickOnSignup();
		signup.enterName("Annu");
		login.enterPhoneNo("");
		login.clickOnGetOTPButton();
		signup.getErrorMsg2();
	}

	@Test
	public void signUpwithoutNameandNum() {
		login.clickOnLoginButton();
		SignUp signup = new SignUp(driver);
		signup.clickOnSignup();
		signup.enterName("");
		login.enterPhoneNo("");
		login.clickOnGetOTPButton();
		signup.getErrorMsg2();
		signup.getErrorMsg1();
	}
	
	@Test
	public void signUpwithRegisteredNum() {
		login.clickOnLoginButton();
		SignUp signup = new SignUp(driver);
		signup.clickOnSignup();
		signup.enterName("annu");
		login.enterPhoneNo("9310980049");
		login.clickOnGetOTPButton();
	}
}
