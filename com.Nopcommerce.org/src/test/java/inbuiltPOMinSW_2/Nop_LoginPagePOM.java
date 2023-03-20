package inbuiltPOMinSW_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Nop_LoginPagePOM {
	
	
	WebDriver driver;
	 
	//Here Creating constructor as same class name
	public Nop_LoginPagePOM(WebDriver d) {
		this.driver =d;
		PageFactory.initElements(driver, this);
	}
	
	//Here gathering the information for login page
	//@FindBy with finding the WebElement for Email 
	@FindBy(id = "Email")
	WebElement emailID;
	
	//@FindBys(Indicates && operator) with finding the WebElement for Password  
	//@FindBys({
	@FindBy(how = How.ID, using = "Password")
	//@FindBy(xpath = "//*[@type='password']")
	//})
	WebElement passwordID;
	
	//@FindAll(Indicates || operator) with finding the WebElement for LoginButton  
	@CacheLookup

		@FindBy(xpath = "//*[text()='Log in']")
	WebElement loginBtn;
	
	
	@FindBy(xpath = "//*[@type = 'submit']")
	WebElement loginVerify;
	

	@FindBy(linkText = "Logout")
	WebElement logoutBtn;
	
		
	//created one method for Email
	public void enterEmailID() {
		emailID.clear();
		emailID.sendKeys("admin@yourstore.com");
	}
	
	//Created one method for Password
	public void enterPasswordID() {
		passwordID.clear();
		passwordID.sendKeys("admin");
	}
	
	public boolean verifyLoginPage() {
		boolean val = loginVerify.isEnabled();
		return val;
}
	//Created one method for LoginButton
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	public void clickOnLogoutBtn() {
		logoutBtn.click();
	}
	

}
