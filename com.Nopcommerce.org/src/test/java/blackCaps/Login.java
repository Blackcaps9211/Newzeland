package blackCaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Login {
	
	
	WebDriver driver;

	public Login (WebDriver d) {

		this.driver = d;
	
		

}
	
//	By.username = By.name("username");
	
	By username = By.name("username");
	By password = By.name("password");
	By clickonlogin = By.xpath("//button[@type='submit']");
	
	
	
	public void enterUserName() {
		driver.findElement(username).sendKeys("Admin");
		
	}

public void enterPassword() {
	driver.findElement(password).sendKeys("admin123");
	}

public void clickonLogin() {
	driver.findElement(clickonlogin).click();
}
			
}
