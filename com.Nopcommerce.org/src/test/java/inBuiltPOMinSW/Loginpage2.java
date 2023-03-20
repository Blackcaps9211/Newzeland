package inBuiltPOMinSW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
	
	WebDriver driver;
	public Loginpage2(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
// Email
	
	// @FindBy(how = How.ID,using = "Email")
	// WebElement Email;
	
	@FindAll({
		
		@FindBy(id = "Email"),
		@FindBy(xpath = "//*[@type='email']")
	})
	WebElement email;
	
	// Password
	
	@FindBy(how = How.ID,using="Password")
	WebElement Password;
	
	// CheckBox
	@FindBy(how = How.ID,using="RememberMe")
	WebElement checkbox;
	
	// Login button
	@FindBy(how = How.XPATH,using="//*[contains(text(),'Log in')]")
	WebElement LoginButton;
	
	
	public void enterEmailId() {
	
		email.clear();
		email.sendKeys("admin@yourstore.com");
	}
	
	public void enterPassword() {
		Password.clear();
		Password.sendKeys("admin");
	}
	
	public void clickCheckBox() {
		checkbox.click();
	}
	
	public void clickOnLoginButton() {
		LoginButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
