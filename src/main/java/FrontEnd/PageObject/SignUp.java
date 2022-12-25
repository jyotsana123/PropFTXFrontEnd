package FrontEnd.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrontEnd.AbstractComponent.AbstractComponent;

public class SignUp extends AbstractComponent {

	WebDriver driver;
	public SignUp(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[3]/section/div/div[2]/form/div[4]/p/a")
	WebElement signup;
	
	@FindBy(css="input[placeholder='Enter Your Full Name")
	WebElement nameTextBox;
	
	@FindBy(xpath="//form/div[1]/h5/span")
	WebElement errorMsg1;
	
	@FindBy(xpath="//form/div[2]/h5/span")
	WebElement errorMsg2;
	
	public void clickOnSignup()
	{
		signup.click();
	}
	
	public void enterName(String name)
	{
		nameTextBox.sendKeys(name);
	}
	
	public void getErrorMsg1()
	{
		System.out.println(errorMsg1.getText());
	}
	
	public void getErrorMsg2()
	{
		System.out.println(errorMsg2.getText());
	}
	
}


