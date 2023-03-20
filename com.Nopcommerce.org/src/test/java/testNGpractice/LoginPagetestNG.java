package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagetestNG {

	
	WebDriver driver;
	public LoginPagetestNG(WebDriver d) {
	
	this.driver = d;
	
	}
	
	
	By username = By.id("Email");
	By password = By.id("Password");
	By clickOnLogin = By.xpath("//*[text()='Log in']");
	
	public void enterEmailId(String un ) {
		
		driver.findElement(username).clear();
		// driver.findElement(username).sendKeys("admin@yourstore.com");
		driver.findElement(username).sendKeys(un);
	}
	
	
    public void enterPassword(String pws) {
		driver.findElement(password).clear();
		// driver.findElement(password).sendKeys("admin");	
		 driver.findElement(password).sendKeys(pws);	

		
	}

    public void clickOnLogin() {
	
    	driver.findElement(clickOnLogin).click();
	
}
	
	
}
