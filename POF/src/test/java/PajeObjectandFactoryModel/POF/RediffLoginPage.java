package PajeObjectandFactoryModel.POF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	
	
	
	public  RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	By Username =By.xpath("//input[@id='login1']");
	By Password=By.name("passwd");
	By SignIn=By.name("proceed");
	
	public WebElement username()
	{
		return driver.findElement(Username);
		
	}
	
	public WebElement password() {
		return driver.findElement(Password);
	}
	
	
	public WebElement signin()
	{
		return driver.findElement(SignIn);
	}
}
