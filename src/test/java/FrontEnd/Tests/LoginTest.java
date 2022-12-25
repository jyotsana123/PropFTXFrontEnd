package FrontEnd.Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import FrontEnd.BaseTest.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest {

	@Test
	public void loginWithPhoneNom() throws InterruptedException {
		login.clickOnLoginButton();
		login.enterPhoneNo("9310980049");
		login.clickOnGetOTPButton();
		String msg = driver.findElement(By.cssSelector("div[class*='Toastify__toast-container']")).getText();
		Assert.assertEquals(msg, "OTP sent successfully");
		login.clickOnVerifyButton();
	}

	@Test
	public void loginWithoutPhoneNom() throws InterruptedException {
		login.clickOnLoginButton();
		login.enterPhoneNo("");
		login.clickOnGetOTPButton();
	}
	
	@Test
	public void loginWithInvalidPhoneNom() throws InterruptedException {
		login.clickOnLoginButton();
		login.enterPhoneNo("csdsvsdv");
		login.clickOnGetOTPButton();
	}
	
	@Test
	public void loginWithPhoneNomlessthan10Digit() throws InterruptedException {
		login.clickOnLoginButton();
		login.enterPhoneNo("931099");
		login.clickOnGetOTPButton();
	}
	
	@Test
	public void loginWithPhoneNomMorethan10Digit() throws InterruptedException {
		login.clickOnLoginButton();
		login.enterPhoneNo("931098004910");
		login.clickOnGetOTPButton();
	}
}
