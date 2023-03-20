package nwezealandpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagePOMpractice {
	
	
	WebDriver driver;
	
	
	
	
	
	
	
	
	@FindBy(how=How.ID,using="Email")
	WebElement EmailID;
	
	@FindBy(how = How.ID,using="Password")
	WebElement Password;
	
	@FindBy(how = How.XPATH, using="//*[contains(text(),'Log in')]")
	WebElement LoginButton;
	
	
	public void enterEmailID() {
		EmailID.clear();
		EmailID.sendKeys("admin@yourstore.com");
	}

	public void enterPassword() {
		Password.clear();
		Password.sendKeys("admin");
		
	}
	
	public void clickonLoginButton() {
		
		LoginButton.click();
	}
	
	
	
	
	
}
