package testNGpractice;

import org.openqa.selenium.WebDriver;

public class VerifyLoginSuccess {

	WebDriver driver;
	public VerifyLoginSuccess(WebDriver d) {
	this.driver = d;
	
	
		 
	String str1 ="Dashboard / nopCommerce administration";
	}
	
public String getPageTitel() {
	return driver.getTitle();
		
	}


}

