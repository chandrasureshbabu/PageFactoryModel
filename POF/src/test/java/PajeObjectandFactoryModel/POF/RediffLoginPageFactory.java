package PajeObjectandFactoryModel.POF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageFactory {
	
	WebDriver driver;
	
	public RediffLoginPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//creating object
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement signin;
	
	
	public WebElement username()
	{
		return username;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement  signin()
	{
		return signin;
	}
}
